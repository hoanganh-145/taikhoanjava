package Lab03;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập bán kính hình tròn: ");
        double banKinh = scanner.nextDouble();
        HinhTron hinhTron = new HinhTron(banKinh);
        System.out.println("Chu vi hình tròn: " + hinhTron.tinhChuVi());
        System.out.println("Diện tích hình tròn: " + hinhTron.tinhDienTich());
        System.out.print("Nhập chiều cao hình trụ: ");
        double chieuCao = scanner.nextDouble();
        HinhTru hinhTru = new HinhTru(banKinh, chieuCao);
        System.out.println("Diện tích hình trụ: " + hinhTru.tinhDienTich());
        System.out.println("Thể tích hình trụ: " + hinhTru.tinhTheTich());
    }
}
