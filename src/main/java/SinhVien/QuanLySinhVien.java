package SinhVien;
import java.util.Scanner;

public class QuanLySinhVien {
    public static void main(String[] args) {
        menu();
    }
    private static void menu(){
        int chon=5;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Chương trình quản lý sinh viên:");
            System.out.println("1. Nhập danh sách sinh viên:");
            System.out.println("2. Xuất thông tin danh sách sinh viên:");
            System.out.println("3. Xuất danh sách sinh viên có học lực giỏi:");
            System.out.println("4. Sắp xếp danh sách sinh viên theo điểm:");
            System.out.println("5. Kết thúc");
            System.out.println("-------------------------------------------------------");
            System.out.print("Chọn chức năng(1=>5: ");
            chon=scanner.nextInt();
            switch (1) {
                case 1:
                    NhapDS();
                    break;
                case 2:
                    XuatDs();
                    break;
                case 3:
                   XuatDsGioi();
                    break;
                case 4:
                    SapXepDSSV();
                    break;
                case 5:
                    System.out.println("Kết thúc chương trình.");
                    return;
                default:
                    System.out.println("Chức năng không hợp lệ. Vui lòng chọn lại.");
            }
        } while (chon !=5);
    }

    private static void NhapDS() {
         Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Chọn loại sinh viên (1: IT, 2: Biz, 0: Kết thúc nhập): ");
            int loai = scanner.nextInt();
            scanner.nextLine();

            if (loai == 0) break;

            System.out.print("Nhập họ tên sinh viên: ");
            String hoTen = scanner.nextLine();

            if (loai == 1) {
                System.out.print("Nhập điểm Java: ");
                double diemJava = scanner.nextDouble();
                System.out.print("Nhập điểm CSS: ");
                double diemCss = scanner.nextDouble();
                System.out.print("Nhập điểm HTML: ");
                double diemHtml = scanner.nextDouble();
                SinhVien svIT = new SinhVienIT(hoTen, diemJava, diemCss, diemHtml);
                danhSachSV.add(svIT);
            } else if (loai == 2) {
                System.out.print("Nhập điểm Marketing: ");
                double diemMarketing = scanner.nextDouble();
                System.out.print("Nhập điểm Sales: ");
                double diemSales = scanner.nextDouble();
                SinhVien svBiz = new SinhVienBiz(hoTen, diemMarketing, diemSales);
                danhSachSV.add(svBiz);
            }
        }
    }

    private static void XuatDs() { 
        for (SinhVien sv : danhSachSV) {
            sv.xuat();
            System.out.println();
        }
    }

    private static void XuatDsGioi() {
        for (SinhVien sv : danhSachSV) {
            if (sv.getHocLuc().equals("Giỏi")) {
                sv.xuat();
                System.out.println();
            }
        }
    }

    private static void SapXepDSSV() {
    }
    
}  
