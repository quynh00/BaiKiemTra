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
    //Chuyển toàn bộ văn bản thành viết hoa
    public String vietHoa(){
        return st.toUpperCase();
    }
    //Chuyển toàn bộ văn bản thành viết thường
    public String vietThuong(){
        return st.toLowerCase();
    }

}
