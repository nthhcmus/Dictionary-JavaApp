package GUI;

import dict.Dict;
import java.awt.Toolkit;
import java.io.*;
import java.text.Collator;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Locale;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GUI_Dict extends javax.swing.JFrame {
    public GUI_Dict() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        readSettingsFile();
        dict = new Dict();
        createManagementFile();
        
        azRadio.setSelected(true);
        showFavorites();
        
        LocalDateTime now = LocalDateTime.now(ZoneId.of("Asia/Ho_Chi_Minh"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String res = now.format(formatter);
        toText.setText(res);
        fromText.setText(res);
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icon/dictForFrame.png")));
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sortFavorButGroup = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        addBut = new javax.swing.JButton();
        saveBut = new javax.swing.JButton();
        lockupLangLabel = new javax.swing.JLabel();
        isVieLabel = new javax.swing.JLabel();
        changeLockupBut = new javax.swing.JButton();
        wordText = new javax.swing.JTextField();
        wordLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        removeBut = new javax.swing.JButton();
        searchBut = new javax.swing.JButton();
        titleLabel1 = new javax.swing.JLabel();
        titleLabel2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        tabbed = new javax.swing.JTabbedPane();
        meaningScroll = new javax.swing.JScrollPane();
        meaningText = new javax.swing.JTextArea();
        statisticPanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        statisticTable = new javax.swing.JTable();
        statisticLabel = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        fromLabel = new javax.swing.JLabel();
        fromText = new javax.swing.JTextField();
        toLabel = new javax.swing.JLabel();
        toText = new javax.swing.JTextField();
        doStaBut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        favorPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        vieFavoritesTable = new javax.swing.JTable();
        azRadio = new javax.swing.JRadioButton();
        zaRadio = new javax.swing.JRadioButton();
        clearFavorites = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        engFavoritesTable = new javax.swing.JTable();
        recommend = new javax.swing.JScrollPane();
        recommendList = new javax.swing.JList<>();
        suggestLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        settingMenu = new javax.swing.JMenu();
        languageMenu = new javax.swing.JMenu();
        vieMenuItem = new javax.swing.JMenuItem();
        engMenuItem = new javax.swing.JMenuItem();
        aboutMenu = new javax.swing.JMenu();
        info = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(242, 235, 228));

        jPanel3.setBackground(new java.awt.Color(242, 249, 179));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel4.setBackground(new java.awt.Color(242, 249, 179));

        addBut.setBackground(new java.awt.Color(255, 0, 0));
        addBut.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addBut.setForeground(new java.awt.Color(255, 255, 255));
        addBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add.png"))); // NOI18N
        addBut.setText("Add to Dictionary");
        addBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButActionPerformed(evt);
            }
        });

        saveBut.setBackground(new java.awt.Color(255, 204, 0));
        saveBut.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saveBut.setForeground(new java.awt.Color(255, 255, 255));
        saveBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/saveToFavor.png"))); // NOI18N
        saveBut.setText("Save to Favorites");
        saveBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButActionPerformed(evt);
            }
        });

        lockupLangLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lockupLangLabel.setForeground(new java.awt.Color(255, 102, 0));
        lockupLangLabel.setText("Lookup-language: ");

        isVieLabel.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        isVieLabel.setForeground(new java.awt.Color(0, 204, 51));
        isVieLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Eng.png"))); // NOI18N
        isVieLabel.setText("English");

        changeLockupBut.setBackground(new java.awt.Color(204, 255, 255));
        changeLockupBut.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        changeLockupBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/change.png"))); // NOI18N
        changeLockupBut.setText("Change");
        changeLockupBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeLockupButActionPerformed(evt);
            }
        });

        wordText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                wordTextKeyReleased(evt);
            }
        });

        wordLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        wordLabel.setForeground(new java.awt.Color(255, 102, 0));
        wordLabel.setText("Word: ");

        jPanel2.setBackground(new java.awt.Color(242, 249, 179));

        removeBut.setBackground(new java.awt.Color(0, 0, 204));
        removeBut.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        removeBut.setForeground(new java.awt.Color(255, 255, 255));
        removeBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/del.png"))); // NOI18N
        removeBut.setText("Remove");
        removeBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButActionPerformed(evt);
            }
        });

        searchBut.setBackground(new java.awt.Color(51, 204, 0));
        searchBut.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searchBut.setForeground(new java.awt.Color(255, 255, 255));
        searchBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/searchIcon.png"))); // NOI18N
        searchBut.setText("Search");
        searchBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(searchBut, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(removeBut))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(searchBut)
                .addComponent(removeBut))
        );

        titleLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        titleLabel1.setForeground(new java.awt.Color(51, 0, 255));
        titleLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel1.setText("Management");
        titleLabel1.setToolTipText("");

        titleLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        titleLabel2.setForeground(new java.awt.Color(51, 0, 255));
        titleLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/dict.png"))); // NOI18N
        titleLabel2.setText("Dictionary");
        titleLabel2.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel2.setText("Salmon © 2023");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(wordLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(wordText, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(titleLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(titleLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(saveBut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addBut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(changeLockupBut)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lockupLangLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(isVieLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(11, 11, 11))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addBut)
                .addGap(8, 8, 8)
                .addComponent(saveBut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lockupLangLabel)
                    .addComponent(isVieLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(changeLockupBut, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(titleLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleLabel1)
                .addGap(2, 2, 2)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wordText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        jPanel3.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(242, 235, 228));
        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel1.setBackground(new java.awt.Color(242, 235, 228));

        tabbed.setBackground(new java.awt.Color(255, 255, 255));

        meaningText.setColumns(20);
        meaningText.setRows(5);
        meaningScroll.setViewportView(meaningText);

        tabbed.addTab("Meaning", meaningScroll);

        statisticPanel.setBackground(new java.awt.Color(153, 255, 204));

        statisticTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Words", "Count (from-to)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        statisticTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                statisticTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(statisticTable);

        statisticLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        statisticLabel.setText("Statistic:");

        jPanel6.setBackground(new java.awt.Color(153, 255, 204));

        fromLabel.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        fromLabel.setText("From:");

        toLabel.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        toLabel.setText("to:");

        doStaBut.setBackground(new java.awt.Color(0, 153, 51));
        doStaBut.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        doStaBut.setForeground(new java.awt.Color(255, 255, 255));
        doStaBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/statistic.png"))); // NOI18N
        doStaBut.setText("Do statistic");
        doStaBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doStaButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(fromLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fromText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(toLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(toText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(doStaBut)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fromLabel)
                    .addComponent(fromText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toLabel)
                    .addComponent(toText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doStaBut))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/date.png"))); // NOI18N
        jLabel1.setText("(dd/mm/yyyy)");

        javax.swing.GroupLayout statisticPanelLayout = new javax.swing.GroupLayout(statisticPanel);
        statisticPanel.setLayout(statisticPanelLayout);
        statisticPanelLayout.setHorizontalGroup(
            statisticPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(statisticPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(statisticPanelLayout.createSequentialGroup()
                        .addComponent(statisticLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(statisticPanelLayout.createSequentialGroup()
                        .addGroup(statisticPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(19, Short.MAX_VALUE))))
        );
        statisticPanelLayout.setVerticalGroup(
            statisticPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, statisticPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(statisticPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statisticLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(2, 2, 2)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabbed.addTab("Statistic", statisticPanel);

        favorPanel.setBackground(new java.awt.Color(204, 255, 255));

        vieFavoritesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vie Words"
            }
        ));
        vieFavoritesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vieFavoritesTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(vieFavoritesTable);

        sortFavorButGroup.add(azRadio);
        azRadio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        azRadio.setForeground(new java.awt.Color(51, 0, 255));
        azRadio.setText("A-Z");
        azRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                azRadioActionPerformed(evt);
            }
        });

        sortFavorButGroup.add(zaRadio);
        zaRadio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        zaRadio.setForeground(new java.awt.Color(51, 0, 255));
        zaRadio.setText("Z-A");
        zaRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zaRadioActionPerformed(evt);
            }
        });

        clearFavorites.setBackground(new java.awt.Color(0, 51, 204));
        clearFavorites.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        clearFavorites.setForeground(new java.awt.Color(255, 255, 255));
        clearFavorites.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/clear.png"))); // NOI18N
        clearFavorites.setText("Clear Favorites");
        clearFavorites.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearFavoritesActionPerformed(evt);
            }
        });

        engFavoritesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Eng Words"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        engFavoritesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                engFavoritesTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(engFavoritesTable);

        javax.swing.GroupLayout favorPanelLayout = new javax.swing.GroupLayout(favorPanel);
        favorPanel.setLayout(favorPanelLayout);
        favorPanelLayout.setHorizontalGroup(
            favorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, favorPanelLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(favorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, favorPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, favorPanelLayout.createSequentialGroup()
                        .addComponent(azRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(zaRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addGroup(favorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clearFavorites)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        favorPanelLayout.setVerticalGroup(
            favorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, favorPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(favorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(azRadio)
                    .addComponent(zaRadio)
                    .addComponent(clearFavorites))
                .addGap(18, 18, 18)
                .addGroup(favorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabbed.addTab("Favorites", favorPanel);

        recommendList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                recommendListMouseClicked(evt);
            }
        });
        recommend.setViewportView(recommendList);

        suggestLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        suggestLabel.setForeground(new java.awt.Color(255, 102, 0));
        suggestLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/idea.png"))); // NOI18N
        suggestLabel.setText("Suggest:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(recommend, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(tabbed, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(suggestLabel)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(suggestLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(recommend, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tabbed, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel1);

        settingMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/settings.png"))); // NOI18N
        settingMenu.setText("Setting");

        languageMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/language.png"))); // NOI18N
        languageMenu.setText("Language");

        vieMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Vie.png"))); // NOI18N
        vieMenuItem.setText("Tiếng Việt");
        vieMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vieMenuItemActionPerformed(evt);
            }
        });
        languageMenu.add(vieMenuItem);

        engMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Eng.png"))); // NOI18N
        engMenuItem.setText("English");
        engMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                engMenuItemActionPerformed(evt);
            }
        });
        languageMenu.add(engMenuItem);

        settingMenu.add(languageMenu);

        jMenuBar1.add(settingMenu);

        aboutMenu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        aboutMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/info.png"))); // NOI18N
        aboutMenu.setText("About");

        info.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/info2.png"))); // NOI18N
        info.setText("Infomation");
        info.setToolTipText("");
        info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoActionPerformed(evt);
            }
        });
        aboutMenu.add(info);

        jMenuBar1.add(aboutMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 904, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void readSettingsFile()
    {
        BufferedReader r = null;
        try {
            r = new BufferedReader(new FileReader(settingsPath));
            String temp = r.readLine();
            temp = r.readLine();
            if("Vie".equals(temp))
            {
                isVieSettings = true;
                setGUILanguage(true);
                
            }
            else 
            {
                isVieSettings = false;
                setGUILanguage(false);
            }
            r.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GUI_Dict.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GUI_Dict.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void createManagementFile() 
    {
        PrintWriter writer;
        try {
            File f = new File(vieHistoryPath);
            writer = new PrintWriter(new FileWriter(f, true));
            writer.close();
            
            f = new File(engHistoryPath);
            writer = new PrintWriter(new FileWriter(f, true));
            writer.close();
            
            f = new File(dict.engFavorPath);
            writer = new PrintWriter(new FileWriter(f, true));
            writer.close();
            
            f = new File(dict.vieFavorPath);
            writer = new PrintWriter(new FileWriter(f, true));
            writer.close();
            
            f = new File(dict.editedPath);
            writer = new PrintWriter(new FileWriter(f, true));
            writer.close();
            
            f = new File(settingsPath);
            writer = new PrintWriter(new FileWriter(f, true));
            writer.close();
           
        } catch (IOException ex) {
            Logger.getLogger(GUI_Dict.class.getName()).log(Level.SEVERE, null, ex);
            if(isVieSettings)
            {
                JOptionPane.showMessageDialog(this, "KHÔNG thấy file");
            }
            else
            {
                JOptionPane.showMessageDialog(this, "File NOT FOUND");
            }
                     
        }
    }
    
    private void saveHistory(String w)
    {
        LocalDateTime now = LocalDateTime.now(ZoneId.of("Asia/Ho_Chi_Minh"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedDateTime = now.format(formatter);

        try
        {
            PrintWriter writer;
            if(isVieDict)
            {
                writer = new PrintWriter(new FileWriter(vieHistoryPath, true));
                writer.println(w);
                writer.println(formattedDateTime);
                writer.close();
            }
            else
            {
                writer = new PrintWriter(new FileWriter(engHistoryPath, true));
                writer.println(w);
                writer.println(formattedDateTime);
                writer.close();
            }
            
        } catch (IOException e) {
            if(isVieSettings)
            {
                JOptionPane.showMessageDialog(this, "Lỗi trong quá trình đọc file");
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Error in writing process!");;
            }
            
        }
    }
    
    private void addButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButActionPerformed
        if("".equals(wordText.getText()))
        {
            
            if(isVieSettings)
            {
                JOptionPane.showMessageDialog(this, "Ô chứa từ TRỐNG");
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Can NOT add EMPTY word!");
            }
            return;
        }
        
        if("".equals(meaningText.getText()))
        {
            if(isVieSettings)
            {
                JOptionPane.showMessageDialog(this, "Nghĩa của từ TRỐNG!\n"
                        + "Hãy nhập nghĩa của từ vào ô nghĩa từ");
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Can NOT add EMPTY meaning!"
                    + "\nPls enter meaning of word to meaning text area");
            }
            return;
        }
        
        boolean notExist = !dict.addVocab(wordText.getText(), meaningText.getText(), isVieDict);
        if(notExist)
        {
            
            if(isVieSettings)
            {
                JOptionPane.showMessageDialog(this, "Từ đã tồn tại trong từ điển!");
            }
            else
            {
                JOptionPane.showMessageDialog(this, "This word already Existed in dictionary!");
            }
        }
        else
        {
            
            if(isVieSettings)
            {
                JOptionPane.showMessageDialog(this, "Thêm từ thành công!");
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Added Successfully!");
            }
        }
    }//GEN-LAST:event_addButActionPerformed

    private void showFavorites()
    {
        try {
            engTreeSet = dict.getFavorSet(false);
            vieTreeSet = dict.getFavorSet(true);
        } catch (IOException ex) {
            Logger.getLogger(GUI_Dict.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        int i = 0;
        int j = 0;
        int engSize = engTreeSet.size();
        int vieSize = vieTreeSet.size();
               

        DefaultTableModel vieModel = (DefaultTableModel) vieFavoritesTable.getModel();
        vieModel.setRowCount(vieSize);
        
        DefaultTableModel engModel = (DefaultTableModel) engFavoritesTable.getModel();
        engModel.setRowCount(engSize);
        for(String value:vieTreeSet)
        {
            if(azRadio.isSelected())
            {
                vieModel.setValueAt(value, i, 0);
            }
            else
            {
                vieModel.setValueAt(value, vieSize-i-1, 0);
            }
            i++;
        }
        for(String v:engTreeSet)
        {
            if(azRadio.isSelected())
            {
                engModel.setValueAt(v, j, 0);
            }
            else
            {
                engModel.setValueAt(v, engSize-j-1,0);
            }
            j++;
        }
    }
    
    private void saveButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButActionPerformed
        boolean isExist = dict.saveToFavoritesFile(wordText.getText(), isVieDict);
        if(!isExist)
        {
            
            if(isVieSettings)
            {
                JOptionPane.showMessageDialog(this, "Không tìm thấy từ trong từ điển");
            }
            else
            {
                JOptionPane.showMessageDialog(this, "NOT FOUND word in dictionary!");
            }
            return;
        }
        else{
            tabbed.setSelectedIndex(2);
            showFavorites();
        }
        

    }//GEN-LAST:event_saveButActionPerformed

    private void changeLockupButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeLockupButActionPerformed
        isVieLabel.setIcon(null);
        if(isVieDict)
        {
            isVieDict = false;
            isVieLabel.setText("English");
            isVieLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Eng.png")));

        }
        else{
            isVieDict = true;
            isVieLabel.setText("Tiếng Việt");
            isVieLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Vie.png")));
        }
    }//GEN-LAST:event_changeLockupButActionPerformed

    private void removeButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButActionPerformed
        String m = dict.searchVocab(wordText.getText(), isVieDict);
        if(m==null)
        {
            if(isVieSettings)
            {
                JOptionPane.showMessageDialog(this, "Không tìm thấy từ trong từ điển");
            }
            else
            {
                JOptionPane.showMessageDialog(this, "NOT FOUND word in dictionary!");
            }
            return;
        }
        else
        {
            int response;
            if(isVieSettings)
            {
                response = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa từ??", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            }
            else
            {
                response = JOptionPane.showConfirmDialog(this, "Do you really want to remove this word?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            }
            if(response ==JOptionPane.YES_OPTION)
            {
                boolean isExist = dict.removeVocab(wordText.getText(), isVieDict);
                if(isVieSettings)
                {
                    JOptionPane.showMessageDialog(this, "Removed Successfully!");
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Removed Successfully!");
                }
            }
        }
    }//GEN-LAST:event_removeButActionPerformed

    private void searchButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButActionPerformed
        String m = dict.searchVocab(wordText.getText(), isVieDict);

        if(m == null)
        {
            if(isVieSettings)
            {
                JOptionPane.showMessageDialog(this, "Không tìm thấy từ trong từ điển");
            }
            else
            {
                JOptionPane.showMessageDialog(this, "NOT FOUND word in dictionary!");
            }
        }
        else{
            meaningText.setText(m);
            saveHistory(wordText.getText());
        }
        tabbed.setSelectedIndex(0);
        meaningText.setCaretPosition(0);
    }//GEN-LAST:event_searchButActionPerformed

    private void doStaButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doStaButActionPerformed
        String from = fromText.getText();
        String to = toText.getText();
        DefaultTableModel model = (DefaultTableModel) statisticTable.getModel();
        model.setRowCount(0);
        history.clear();

        String[] sp = from.split("/");
        String[] sp2 = to.split("/");
        LocalDateTime fr = null;
        LocalDateTime t = null;
        try{
            fr = LocalDateTime.of(Integer.parseInt(sp[2]),
                Integer.parseInt(sp[1]), Integer.parseInt(sp[0]), 0, 0, 0);

            t = LocalDateTime.of(Integer.parseInt(sp2[2]),
                Integer.parseInt(sp2[1]), Integer.parseInt(sp2[0]), 23, 59, 59);
        }
        catch(Exception e)
        {
            if(isVieSettings)
            {
                JOptionPane.showMessageDialog(this, "Sai format!\nHãy nhập ngày tháng theo format: dd/mm/yyyy!");
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Wrong format!\nPls enter the correct format: dd/mm/yyyy!");
            }
            
            return;
        }
        if(from == null || to == null)
        {
            if(isVieSettings)
            {
                JOptionPane.showMessageDialog(this, "Sai format!\nHãy nhập ngày tháng theo format: dd/mm/yyyy!");
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Wrong format!\nPls enter the correct format: dd/mm/yyyy!");
            }
            return;
        }

        BufferedReader reader = null;
        try {
            if(isVieDict)
            {
                reader = new BufferedReader(new FileReader(vieHistoryPath));
            }
            else
            {
                reader = new BufferedReader(new FileReader(engHistoryPath));
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GUI_Dict.class.getName()).log(Level.SEVERE, null, ex);
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String word = "";
        String time = "";
        while(true)
        {
            try {
                word = reader.readLine();
                time = reader.readLine();
                if(word==null || time==null)
                {
                    break;
                }
                LocalDateTime timeFromFile = LocalDateTime.parse(time, formatter);
                if(timeFromFile.isAfter(fr) && timeFromFile.isBefore(t))
                {
                    Integer cnt = history.get(word);
                    if(cnt == null)
                    {
                        history.put(word, 1);
                    }
                    else
                    {
                        history.put(word, cnt+1);
                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(GUI_Dict.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            reader.close();
        } catch (IOException ex) {
            Logger.getLogger(GUI_Dict.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(String key:history.keySet())
        {
            Integer value = history.get(key);
            model.addRow(new String[]{key, value.toString()});
        }
    }//GEN-LAST:event_doStaButActionPerformed

    private void azRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_azRadioActionPerformed
        showFavorites();
    }//GEN-LAST:event_azRadioActionPerformed

    private void zaRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zaRadioActionPerformed
        showFavorites();
    }//GEN-LAST:event_zaRadioActionPerformed

    private void clearFavoritesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearFavoritesActionPerformed
        int response;
        if(isVieSettings)
            {
                response = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa danh sách yêu thích?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            }
            else
            {
                response = JOptionPane.showConfirmDialog(this, "Do you really want to clear favorites?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            }
        if(response ==JOptionPane.YES_OPTION)
        {
            PrintWriter writer;
            try {
                writer = new PrintWriter(new FileWriter(dict.vieFavorPath, false));
                writer.close();
                writer = new PrintWriter(new FileWriter(dict.engFavorPath, false));
                writer.close();
                DefaultTableModel model = (DefaultTableModel) vieFavoritesTable.getModel();
                model.setRowCount(0);
                DefaultTableModel m = (DefaultTableModel) engFavoritesTable.getModel();
                m.setRowCount(0);
                vieTreeSet.clear();
                engTreeSet.clear();
                
            } catch (IOException ex) {
                Logger.getLogger(GUI_Dict.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_clearFavoritesActionPerformed

    private void wordTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wordTextKeyReleased
       meaningText.setText("");
       recommendList.setListData(dict.getRecommendation(wordText.getText(), isVieDict));
       recommendList.clearSelection();
    }//GEN-LAST:event_wordTextKeyReleased

    private void statisticTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statisticTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) statisticTable.getModel();
        int idx = statisticTable.getSelectedRow();
        wordText.setText(model.getValueAt(idx, 0).toString());
    }//GEN-LAST:event_statisticTableMouseClicked

    private void recommendListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recommendListMouseClicked
        wordText.setText(recommendList.getSelectedValue());
        
    }//GEN-LAST:event_recommendListMouseClicked

    private void infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoActionPerformed
        String res = "App:                  TuDien\nVersion:            1.0\nDev by:             Salmon (Nguyen Trong Hieu)\nUser Directory: ";
        res+=System.getProperty("user.dir");
        JOptionPane.showMessageDialog(this, res);
    }//GEN-LAST:event_infoActionPerformed

    void setGUILanguage(boolean isVie)
    {
        if(isVie)
        {
            settingMenu.setText("Cài đặt");
            languageMenu.setText("Ngôn ngữ");
            info.setText("Thông tin");
            titleLabel2.setText("Quản lý");
            titleLabel1.setText("Từ điển");
            searchBut.setText("Tìm từ");
            removeBut.setText("Xóa từ");
            addBut.setText("Thêm từ vào từ điển");
            saveBut.setText("Thêm vào \"Yêu thích\"");
            wordLabel.setText("Từ");
            lockupLangLabel.setText("Ngôn ngữ tra từ");
            changeLockupBut.setText("  Đổi ");
            suggestLabel.setText("Gợi ý:");
            tabbed.setTitleAt(0, "Nghĩa");
            tabbed.setTitleAt(1, "Thống kê");
            tabbed.setTitleAt(2, "Yêu thích");
            statisticLabel.setText("Thống kê");
            fromLabel.setText("Từ");
            toLabel.setText("đến");
            doStaBut.setText("Thống kê");
            statisticTable.getColumnModel().getColumn(0).setHeaderValue("Các từ");
            statisticTable.getColumnModel().getColumn(1).setHeaderValue("Số lần");
            vieFavoritesTable.getColumnModel().getColumn(0).setHeaderValue("Từ tiếng Việt");
            engFavoritesTable.getColumnModel().getColumn(0).setHeaderValue("Từ tiếng Anh");
            clearFavorites.setText("Xóa danh sách");
        }
        else
        {
            settingMenu.setText("Setting");
            languageMenu.setText("Language");
            info.setText("Information");
            titleLabel2.setText("Dictionary");
            titleLabel1.setText("Management");
            searchBut.setText("Search");
            removeBut.setText("Remove");
            addBut.setText("Add to Dictionary");
            saveBut.setText("Save to Favorites");
            wordLabel.setText("Word");
            lockupLangLabel.setText("Look-up language:");
            changeLockupBut.setText("Change");
            suggestLabel.setText("Suggest:");
            tabbed.setTitleAt(0, "Meaning");
            tabbed.setTitleAt(1, "Statistic");
            tabbed.setTitleAt(2, "Favorites");
            statisticLabel.setText("Statistic");
            fromLabel.setText("From");
            toLabel.setText("to");
            doStaBut.setText("Do statistic");
            statisticTable.getColumnModel().getColumn(0).setHeaderValue("Words");
            statisticTable.getColumnModel().getColumn(1).setHeaderValue("Count");
            vieFavoritesTable.getColumnModel().getColumn(0).setHeaderValue("Vie Words");
            engFavoritesTable.getColumnModel().getColumn(0).setHeaderValue("Eng Words");
            clearFavorites.setText("Clear favorites");
        }
    }
    
    private void engMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_engMenuItemActionPerformed
        if(isVieSettings)
        {
            if(isVieSettings==true)
            {
                isVieSettings = false;
                setGUILanguage(false);
            }
            PrintWriter writer;
            try {
                writer = new PrintWriter(new FileWriter(settingsPath, false));
                writer.println("GUI Language");
                writer.println("Eng");
                writer.close();
            } catch (IOException ex) {
                Logger.getLogger(GUI_Dict.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_engMenuItemActionPerformed
    
    private void vieMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vieMenuItemActionPerformed
        if(isVieSettings==false)
        {
            isVieSettings = true;
            setGUILanguage(true);
            
            PrintWriter writer;
            try {
                writer = new PrintWriter(new FileWriter(settingsPath, false));
                writer.println("GUI Language");
                writer.println("Vie");
                writer.close();
            } catch (IOException ex) {
                Logger.getLogger(GUI_Dict.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_vieMenuItemActionPerformed

    private void vieFavoritesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vieFavoritesTableMouseClicked
        int i = vieFavoritesTable.getSelectedRow();
        wordText.setText(vieFavoritesTable.getValueAt(i, 0).toString());
    }//GEN-LAST:event_vieFavoritesTableMouseClicked

    private void engFavoritesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_engFavoritesTableMouseClicked
        int i = engFavoritesTable.getSelectedRow();
        wordText.setText(engFavoritesTable.getValueAt(i, 0).toString());
    }//GEN-LAST:event_engFavoritesTableMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Dict.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GUI_Dict().setVisible(true);
                
            }
        });
    }

    //set comparator to sort vietnamese
    private Locale vieL = new Locale("vi", "VN");
    public Collator vieColl = Collator.getInstance(vieL);
    {vieColl.setStrength(Collator.PRIMARY);}
    
    static Dict dict;
    private final String settingsPath = "management_files/settings.txt";
    private final String engHistoryPath = "management_files/engHistory.txt";
    private final String vieHistoryPath = "management_files/vieHistory.txt";
    private TreeSet<String> engTreeSet = new TreeSet<String>();
    private TreeSet<String> vieTreeSet = new TreeSet<String>(vieColl);
    private HashMap<String, Integer> history = new HashMap<String, Integer>();
    private boolean isVieDict = false;
    private boolean isVieSettings;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu aboutMenu;
    private javax.swing.JButton addBut;
    private javax.swing.JRadioButton azRadio;
    private javax.swing.JButton changeLockupBut;
    private javax.swing.JButton clearFavorites;
    private javax.swing.JButton doStaBut;
    private javax.swing.JTable engFavoritesTable;
    private javax.swing.JMenuItem engMenuItem;
    private javax.swing.JPanel favorPanel;
    private javax.swing.JLabel fromLabel;
    private javax.swing.JTextField fromText;
    private javax.swing.JMenuItem info;
    private javax.swing.JLabel isVieLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JMenu languageMenu;
    private javax.swing.JLabel lockupLangLabel;
    private javax.swing.JScrollPane meaningScroll;
    private javax.swing.JTextArea meaningText;
    private javax.swing.JScrollPane recommend;
    private javax.swing.JList<String> recommendList;
    private javax.swing.JButton removeBut;
    private javax.swing.JButton saveBut;
    private javax.swing.JButton searchBut;
    private javax.swing.JMenu settingMenu;
    private javax.swing.ButtonGroup sortFavorButGroup;
    private javax.swing.JLabel statisticLabel;
    private javax.swing.JPanel statisticPanel;
    private javax.swing.JTable statisticTable;
    private javax.swing.JLabel suggestLabel;
    private javax.swing.JTabbedPane tabbed;
    private javax.swing.JLabel titleLabel1;
    private javax.swing.JLabel titleLabel2;
    private javax.swing.JLabel toLabel;
    private javax.swing.JTextField toText;
    private javax.swing.JTable vieFavoritesTable;
    private javax.swing.JMenuItem vieMenuItem;
    private javax.swing.JLabel wordLabel;
    private javax.swing.JTextField wordText;
    private javax.swing.JRadioButton zaRadio;
    // End of variables declaration//GEN-END:variables
}
