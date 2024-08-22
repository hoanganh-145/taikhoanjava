package Lab03;
public class HinhTron {
    private double banKinh;

    
    public HinhTron() {
    }
    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }
    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }
    public double getBanKinh() {
        return this.banKinh;
    }
    public double tinhDienTich() {
        return Math.PI * Math.pow(banKinh, 2);
    }
    public double tinhChuVi() {
        return 2 * Math.PI * banKinh;
    }
}

