package SinhVien;
public abstract class SinhVien {
    protected String hoTen;
    protected String nganh;

    public SinhVien(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public abstract double getDiem();

    public String getHocLuc() {
        double diem = getDiem();
        if (diem < 5) {
            return "Yếu";
            
        } else if (diem < 6.5) {
            return "Trung bình";
        } else if (diem < 7.5) {
            return "Khá";
        } else if (diem < 9) {
            return "Giỏi";
        } else {
            return "Xuất sắc";
        }
    }

    public void xuat() {
        System.out.println("Họ tên: " + this.hoTen);
        System.out.println("Ngành: " + this.nganh);
        System.out.println("Điểm: " + this.getDiem());
        System.out.println("Học lực: " + this.getHocLuc());
    }
}


