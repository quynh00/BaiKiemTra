package Cau_3;

import java.util.Locale;

public class VanBan {
    private String st;
    public VanBan() {
    }

    public VanBan(String st) {
        this.st = st;
    }

    public String getSt() {
        return st;
    }

    public void setSt(String st) {
        this.st = st;
    }
    //Đếm số từ của văn bản
    public int demTu(){
        return st.length();
    }
    //Chuyển toàn bộ văn bản thành viết hoa
    public String vietHoa(){
        return st.toUpperCase();
    }
    //Chuyển toàn bộ văn bản thành viết thường
    public String vietThuong(){
        return st.toLowerCase();
    }
    public void vietHoaChuDau(){
        System.out.println("Chuỗi viết hoa chữ cái đầu: " +
                st.substring(0, 1).toUpperCase() + st.substring(1));
    }

    @Override
    public String toString() {
        return "VanBan{" +
                "st='" + st + '\'' +
                '}';
    }
}
