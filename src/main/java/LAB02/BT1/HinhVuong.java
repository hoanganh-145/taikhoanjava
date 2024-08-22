package LAB02.BT1;
public class HinhVuong extends HinhChuNhat{

    public HinhVuong(double canh) {
        super(canh,canh);
    }

    @Override
    public void Xuat() {
        System.out.println("HV_Canh" +super.dai + " Chu vi"+super.getChuVi()+"Dien tich " +super.getDienTich());
    }
   
   
}
