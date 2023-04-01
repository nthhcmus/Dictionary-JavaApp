# **Hướng dẫn sử dụng chương trình Dictionary**

> ***Thông tin chương trình***
>
> Chương trình giúp tra cứu từ điển Anh-Việt, Việt-Anh với các chức năng: Search, Remove, Add to Dictionary, Save to Favorites, Do Statistic (View search history)
>
> Dữ liệu của chương trình là 2 files input: *Anh_Viet.xml và Viet_Anh.xml* + các files quản lý: *editedWord.txt, engHistory.txt, vieHistory.txt, favorEng.txt, favorViet.txt, settings.txt*

> ***Thông tin sinh viên và môn học:***
> 
> Họ và tên: Nguyễn Trọng Hiếu
> 
> Mã số sinh viên: 21120068
> 
> Môn học: Lập trình ứng dụng Java - 21_6
>
>Giảng viên hướng dẫn: Thầy Nguyễn Lê Hoàng Dũng
>
> Trường Đại học Khoa học Tự nhiên - Đại học Quốc gia TP.HCM

> ***Thông tin liên hệ:***
> 
> Email: hieunt.wk@gmail.com
> 
> Số điện thoại: 0971530104
>
> Facebook:  [Nguyen Trong Hieu](https://www.facebook.com/profile.hieunguyen)

>
## **I. Cách để chạy chương trình**
- Double click vào file **Dictionary.jar** trong thư mục **Release**
- Biên dịch lại và chạy chương trình bằng các files trong thư mục **Source**
## **II. Hướng dẫn sử dụng** 
#### *(Hướng dẫn sử dụng sau đây sử dụng ngôn ngữ giao diện chương trình là tiếng Anh)*
### **1. Setting (Cài đặt) và About**
- Trên thanh menu bar của chương trình có thể chọn **Setting** -> **Language** để thay đổi ngôn ngữ giao diện từ Tiếng Anh qua Tiếng Việt hoặc ngược lại
- Cùng trên thanh menu bar đó, chọn **About** để hiển thị thông tin chương trình

### **2. Change (Đổi ngôn ngữ tra cứu)**
- Ngôn ngữ đang dùng để tra cứu sẽ hiện lên ở nhãn *Look-up language* tương ứng với ngôn ngữ là English hay Tiếng Việt sẽ chọn từ điển Anh-Viet, Viet-Anh để tra từ 
- Nhấn vào Change để thay đổi ngôn ngữ từ English -> tiếng Việt và ngược lại

### **3. Search (Tìm từ)**
- Đánh từ vào ô **Word** (Lúc đánh từ sẽ hiện ra gợi ý ở trong phần **Suggest** với các từ gợi ý là các từ có các chữ cái bắt đầu bằng các chữ đã được đánh vào ô **Word**)
- Lúc này, ngoài cách đánh từ trực tiếp vào ô Word có thể dùng chuột để chọn một trong các từ gợi ý trong danh sách **Suggest**, từ đó sẽ hiện lên ở ô **Word**. 
- Sau đó chọn **Search** để tìm kiếm nghĩa của từ. 
    + Nếu từ có trong từ điển, nghĩa của từ sẽ hiện lên ở Tab **Meaning** nằm ở bên phải phần **Suggest**
    + Nếu từ không có trong từ điển, hộp thoại sẽ hiện ra thông báo: *"NOT FOUND word in dictionary!"*
### **4. Remove (Xóa từ)**
- Tương tự như Search, đánh từ vào ô **Word** sau đó nhấn **Remove** để xóa từ. 
- Lúc này có một hộp thoại hiện lên để xác nhận ý muốn xóa từ lần nữa, chọn Yes để xác nhận xóa, No để hủy bỏ thao tác
- Sau khi xác nhận
    + Nếu từ có trong từ điển, sẽ hiện ra thông báo *"Removed Successfully!"*
    + Nếu từ không có trong từ điển, hộp thoại sẽ hiện ra thông báo: *"NOT FOUND word in dictionary!"*

### **5. Add to Dictionary (Thêm từ vào từ điển)**
- Đánh từ vào ô **Word**, đánh nghĩa của từ vào Tab **Meaning** sau đó nhấn **Add to Dictionary** để thêm từ
- Nếu để trống ô **Word** hoặc ô **Meaning** sẽ không thể thêm từ và hiện lên thông báo *"Can NOT add EMPTY word / Can Not add EMPTY meaning! Pls enter meaning of word to meaning text area"*
- Nếu thêm từ thành công sẽ hiện ra thông báo *"Added Successfully"*

### **6. Save to Favorites (Lưu vào danh sách yêu thích)**
- Đánh từ vào ô **Word** như phần Search, sau đó nhấn **Save to favorites** để thêm từ vào danh sách yêu thích
    - Nếu từ không có trong từ điển sẽ hiện ra thông báo: *"NOT FOUND word in dictionary!"*
    - Nếu từ có trong từ điển, tương ứng với ngôn ngữ tra cứu từ hiện tại sẽ thêm vào danh sách **Vie Words** hay **Eng Word** trong tab **Favorites**
    - Trong tab **Favorites** cũng có thể chọn **A-Z** hay **Z-A** để sắp xếp danh sách Favorites từ A đến Z hoặc ngược lại

### **7. Do Statistic (Thống kê)**
- Nhập ngày thống kê bắt đầu, kết thúc ở ô ***From*** , ***to*** tương ứng
    - Yêu cầu ngày nhập vào phải theo format dd/mm/yyyy. Ví dụ: 28/06/2023
    - Ngày mặc định trong from và to của chương trình là ngày hiện tại theo thời gian ở Ho_Chi_Minh (Vietnam)
- Sau khi nhập ngày, nhấn **Do Statistic** để thống kê
    - Nếu ngày nhập vào không hợp lệ sẽ hiện ra hộp thoại thông báo: *"Wrong format! Pls enter the correct format: dd/mm/yyyy!"*
    - Nếu ngày nhập vào đúng format, sẽ tiến hành thống kê vào trong bảng thống kê. Với **Words** là các từ đã tra, **Count** là số lần tra một từ.

# **<p style="text-align:center"> -Hết- </p>**


    





