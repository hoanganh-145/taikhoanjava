package LAB02.BT1;
public class HinhChuNhat {

    public double dai;
    public double rong;

    public HinhChuNhat() {
    }

    public HinhChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public Double getDai() {
        return dai;
    }

    public void setDai(Double dai) {
        this.dai = dai;
    }

    public double getRong() {
        return rong;
    }

    public void setRong(double rong) {
        this.rong = rong;
    }

    public double getChuVi() {
        return (dai + rong) * 2;
    }

    public double getDienTich() {
        return dai * rong;
    }

    public void Xuat() {
        System.out.println("HCN_Chieu dai" + dai + "chieu rong" + rong + " Chu vi" + getChuVi() + "Dien tich " + getDienTich());
    }
}
