package oop.Bt2;
public class Chuongtrinh {
    public static void main(String[] args) {
        Account ac1 = new Account("1", "Nguyen Huynh Hoang Anh", 10000);
        Account ac2 = new Account("2", "Ngo Ba Kha", 40000);
        System.out.println("thong tin tai khoan");
        System.out.println("TK cua toi[id:" + ac1.getId() + "name:" + ac1.getName() + "balance" + ac1.getBalance());
        System.out.println("TK nhan tien [id:" + ac2.getId() + "name:" + ac2.getName() + "balance" + ac2.getBalance());
        System.out.println("rut 50000 tu tai khoan cua toi");
        ac1.debit(500000);
        System.out.println("nap vao 10000 vao  tai khoan nhan tien:");
        ac1.credit(100000);
        System.out.println(" chuyen 10000 tu tai khoan nhan tien den tai khoan cua toi:");
        ac2.TraferTo(ac1, 10000);
        System.out.println("so du tai khoan sao khi giao dich:");
        System.out.println("TK cua toi[id:" + ac1.getId() + "name:" + ac1.getName() + "balance" + ac1.getBalance());
        System.out.println("TK nhyan tien [id:" + ac2.getId() + "name:" + ac2.getName() + "balance" + ac2.getBalance());
    }
}
