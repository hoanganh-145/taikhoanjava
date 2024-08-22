package Lab03;
public class HinhTru extends HinhTron {
    private double chieuCao;
    public HinhTru() {
        super();
        this.chieuCao = 0.0;
    }
    public HinhTru(double banKinh, double chieuCao) {
        super(banKinh);
        this.chieuCao = chieuCao;
    }
    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }
    public double getChieuCao() {
        return this.chieuCao;
    }
    public double tinhTheTich() {
        return super.tinhDienTich() * chieuCao;
    }
    @Override
    public double tinhDienTich() {
        return 2 * Math.PI * getBanKinh() * (getBanKinh() + chieuCao);
    }
}


