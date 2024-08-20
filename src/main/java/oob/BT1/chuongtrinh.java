package oob.BT1;

import java.util.Scanner;
public class chuongtrinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle r1, r2;
        System.out.print("r1");
        r1 = new Rectangle();
        System.out.print("t2");
        System.out.print("chieu dai: ");
        double dai = sc.nextDouble();
        System.out.print("Chieu rong: ");
        double rong = sc.nextDouble();
        r2 = new Rectangle(dai,rong);
        System.out.println("Thong tin ket qua ");
        System.out.println("HCN r1: dai:" + r1.getLenght() + " -rong: " + r1.getWidth() + "chu vi" +r1.tinhchuvi()  + "dien tich" + r1.tinhdientich());
        System.out.println("HCN r2: dai:" + r2.getLenght() + " -rong: " + r2.getWidth() + "-dientich" + r2.tinhdientich() + "-chuvi" + r2.tinhchuvi());
        System.err.println("kq:");      
    }
}
