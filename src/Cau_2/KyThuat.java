package Cau_2;

public class KyThuat extends NhanVien{
    private String chuyenNganh;

    public KyThuat() {
    }

    public KyThuat(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public KyThuat(String id, String name, String year, String address, String chuyenNganh) {
        super(id, name, year, address);
        this.chuyenNganh = chuyenNganh;
    }

    public KyThuat(String id, String name, String year, String address) {
        super(id, name, year, address);
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    @Override
    public String moTaCongViec() {
        return "Hỗ trợ kỹ thuật";
    }

    @Override
    public String toString() {
        return "KyThuat{" + super.toString() +
                ", chuyenNganh='" + chuyenNganh + '\'' +
                '}';
    }
}
