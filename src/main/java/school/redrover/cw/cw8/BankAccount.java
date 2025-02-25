package school.redrover.cw.cw8;

public class BankAccount {

    private String accountNo;
    private int balance;

    public void credit(int amount) {

        balance += amount;
    }

    public void debit(int amount) {

        if (balance < amount) {
            System.out.println("Cannot withdraw more than you have");
        } else {
            balance -= amount;
        }
    }

    public static void main(String[] args) {

        BankAccount checking = new BankAccount();

        checking.credit(100);
        System.out.println(checking.balance);

        checking.credit(100);
        System.out.println(checking.balance);

        checking.debit(150);
        System.out.println(checking.balance);

        checking.debit(150);
        System.out.println(checking.balance);

    }
}