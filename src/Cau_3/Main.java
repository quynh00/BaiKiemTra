package Cau_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VanBan chuoi1 = new VanBan("nghiem thuy quynh");
        System.out.println(chuoi1.vietHoa());

        VanBan chuoi2 = new VanBan("Nghiem thuy QUYNH");
        System.out.println(chuoi2.vietThuong());

    }
}
