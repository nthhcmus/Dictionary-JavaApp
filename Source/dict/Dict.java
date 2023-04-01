/*
    Dev by:         Salmon(Nguyen Trong Hieu)
    Release date:   01/04/2023
    GitHub project: https://github.com/nthhcmus/Dictionary-Java
*/

package dict;

import GUI.GUI_Dict;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.*;
import org.w3c.dom.*;

public class Dict {
    public final String vieDictPath = "input/Viet_Anh.xml";
    public final String engDictPath = "input/Anh_Viet.xml";
    public final String vieFavorPath = "management_files/favorViet.txt";
    public final String engFavorPath = "management_files/favorEng.txt";
    public final String editedPath = "management_files/editedWord.txt"; //contain removed and added words
    
    //set comparator to sort vietnamese
    private Locale vieL = new Locale("vi", "VN");
    public Collator vieColl = Collator.getInstance(vieL);
    {vieColl.setStrength(Collator.PRIMARY);}
    
    private HashMap<String, String> vieDict = new HashMap<String, String>();
    
    private HashMap<String, String> engDict = new HashMap<String, String>();
    
    private TreeSet<String> vieFavor = new TreeSet<String>(vieColl);
    
    private TreeSet<String> engFavor = new TreeSet<String>();
    
    public Dict()
    {
        readByDOM(true, vieDictPath);
        readByDOM(false, engDictPath);
        readEdiiedFile();
    }   
    
    public String searchVocab(String w, boolean vie)
    {
        String m;
        if(vie)
        {
            m = vieDict.get(w);
        }
        else m = engDict.get(w);
        return m;
    }
    
    public String[] getRecommendation(String w, boolean vie)
    {
        //Locale vieLocale = new Locale("vi", )
        String[] keySet;
        List<String> res;
        if(vie)
        {
            keySet =  vieDict.keySet().toArray(new String[vieDict.keySet().size()]);
            res = new ArrayList<>();
            for (int i = 0; i < vieDict.keySet().size(); i++)
            {
                
                if (keySet[i].startsWith(w))
                    res.add(keySet[i]);
            }
        }
        else 
        {
            keySet =  engDict.keySet().toArray(new String[engDict.keySet().size()]);
            res = new ArrayList<>();
            for (int i = 0; i < engDict.keySet().size(); i++)
            {
                
                if (keySet[i].startsWith(w))
                    res.add(keySet[i]);
            }
        }
        String[] result = res.toArray(new String[res.size()]);
        if(vie)
        {
            Arrays.sort(result, vieColl);
        }
        else
        {
            Arrays.sort(result, vieColl);
        }
        return result; 
    }
    
    public boolean addVocab(String w, String m, boolean vie)
    {
        if(searchVocab(w, vie) != null)
        {
            return false;
        }
        
        if(vie)
        {
            vieDict.put(w, m);
            
        }
        else 
        {
            engDict.put(w, m);
        }
        PrintWriter writer;
        try {
            writer = new PrintWriter(new FileWriter(editedPath, true));
            writer.println("add");
            if(vie)
            {
                writer.println("vie");
            }
            else writer.println("eng");
            writer.println(w);
            writer.println(m);
            writer.println("-end word-");
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(Dict.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    
    public boolean removeVocab(String w, boolean vie)
    {
        if(searchVocab(w, vie) == null)
        {
            return false;
        }
        if(vie) vieDict.remove(w);
        else engDict.remove(w);
        
        PrintWriter writer;
        try {
            writer = new PrintWriter(new FileWriter(editedPath, true));
            writer.println("remove");
            if(vie)
            {
                writer.println("vie");
            }
            else writer.println("eng");
            writer.println(w);
            writer.println("-end word-");
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(Dict.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return true;
    }
    
    public boolean saveToFavoritesFile(String w, boolean vie)
    {
        String m = searchVocab(w, vie);
        PrintWriter writer;
        if(m==null)
        {
            return false;
        }
        if(vie)
        {
            try {
                    writer = new PrintWriter(new FileWriter(vieFavorPath, true));
                    writer.println(w);
                    writer.close();
                    
                    
                } catch (IOException ex) {
                    Logger.getLogger(GUI_Dict.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        else
        {
            try {
                    writer = new PrintWriter(new FileWriter(engFavorPath, true));
                    writer.println(w);
                    writer.close();
                    
                } catch (IOException ex) {
                    Logger.getLogger(GUI_Dict.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        return true;
    }
    
    public TreeSet<String> getFavorSet(boolean vie) throws FileNotFoundException, IOException
    {
        BufferedReader reader = null;
        if(vie) 
        {
            reader = new BufferedReader(new FileReader(vieFavorPath));
            while(true)
            {
                String res = reader.readLine();
                if(res==null || reader == null) break;
                vieFavor.add(res);
            }
            return vieFavor;
        }
        else 
        {
            reader = new BufferedReader(new FileReader(engFavorPath));
            while(true)
            {
                String res = reader.readLine();
                if(res==null || reader == null) break;
                engFavor.add(res);
            }
            return engFavor;
        }
    }
    public void readEdiiedFile()
    {
        //add and remove word from addedFile and removedFile
        try{
            BufferedReader reader = null;
            reader = new BufferedReader(new FileReader(editedPath));
            while(true)
            {
                String meaning = "";
                String Operation = reader.readLine(); //add or remove
                String lang = reader.readLine(); //vie or eng
                String word = reader.readLine();
                String m = reader.readLine();
                while(m!= null &&!"-end word-".equals(m))
                {
                    meaning+=m+="\n";
                    m = reader.readLine();
                }
                if(word==null || lang == null || Operation == null || m ==null) break;
                
                if("add".equals(Operation))
                {
                    if("vie".equals(lang))
                    {
                        vieDict.put(word, meaning);
                    }
                    else
                    {
                        engDict.put(word, meaning);
                    }
                }
                else if("remove".equals(Operation))
                {
                    if("vie".equals(lang))
                    {
                        vieDict.remove(word);
                    }
                    else
                    {
                        engDict.remove(word);
                    }
                }
            }
        } catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public void readByDOM(boolean vie, String path)
    {
        try{
            File in = new File(path);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(in);
            doc.getDocumentElement().normalize();
            
            //System.out.println("Phan tu goc:" + doc.getDocumentElement().getNodeName());
            
            NodeList nodeListWord = doc.getElementsByTagName("record");
            int leng = nodeListWord.getLength();
            for(int i=0;i<leng;i++)
            {
                Node nNode = nodeListWord.item(i);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) 
                {
                    Element eElement = (Element) nNode;
                    String w = eElement.getElementsByTagName("word").item(0).getTextContent();
                    String m = eElement.getElementsByTagName("meaning").item(0).getTextContent();                                

                    if(vie){
                        vieDict.put(w, m);
                    }
                    else{
                        engDict.put(w, m);
                    }
                }
            } 
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
