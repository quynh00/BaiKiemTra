package Cau_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NhanVien nv1 = new KyThuat("NV01","AAA", "01/01/1998",
                "HN", "IT");
        System.out.println(nv1);
        System.out.println(nv1.moTaCongViec());

        Scanner in = new Scanner(System.in);
        System.out.print("Nhập mã nhân viên: ");
        String id = in.nextLine();
        System.out.print("Nhập họ tên: ");
        String name = in.nextLine();
        System.out.print("Nhập năm sinh: ");
        String year = in.nextLine();
        System.out.print("Nhập địa chỉ: ");
        String address = in.nextLine();
        System.out.print("Nhập chuyên nghành: ");
        String chuyenNghanh = in.nextLine();
        NhanVien nv2 = new KyThuat(id,name, year, address, chuyenNghanh);
        System.out.println(nv2);
        System.out.println(nv2.moTaCongViec());
    }

}
