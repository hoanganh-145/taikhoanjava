package oop.Bt2;
public class Account {

    private String id;
    private String name;
    private int balance;

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void credit(int amount) {
        if (balance < amount) {
            balance += amount;
            System.out.println("Thanh toan thanh cong:");
        } else {
            System.out.println("Thuc hien khong thanh cong:");
        }
    }

    public void debit(int amount) {
        if (balance > amount) {
            balance -= amount;
            System.out.println("Thanh toan thanh cong:");
        } else {
            System.out.println("Thuc hien khong thanh cong:");
        }
    }

    public void TraferTo(Account other, int amount) {
        if (balance >= amount) {
            balance -= amount;
            other.balance += amount;
            System.out.println("Giao dich thanh cong:");
        } else {
            System.out.println("Giao dich khong thanh cong:");
           
        }
    } 
}
    
