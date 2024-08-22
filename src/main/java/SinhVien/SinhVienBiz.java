package SinhVien;
public class SinhVienBiz extends SinhVien {
    private double diemMarketing;
    private double diemSales;

    // Constructor
    public SinhVienBiz(String hoTen, double diemMarketing, double diemSales) {
        super(hoTen, "Kinh doanh");
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    @Override
    public double getDiem() {
        return (diemMarketing * 2 + diemSales) / 3;
    }
}
