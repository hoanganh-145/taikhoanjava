package LAB02.BT1;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Thong tin hinh chu nhat");
        System.out.println("Chieu dai:");
        double dai=sc.nextDouble();
        System.out.println("Chieu rong:");
        double rong=sc.nextDouble();
        HinhChuNhat hcn=new HinhChuNhat(dai,rong);
        System.out.println("Ket qua:");
        hcn.Xuat();
        System.out.println("Thong tin hinh vuong");
        System.out.println("canh:");
        double canh=sc.nextDouble();
        HinhVuong hv=new HinhVuong(canh);
        System.out.println("Ket Qua:");
        hv.Xuat();
    }
}
