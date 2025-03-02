package school.redrover.cw.cw9;

public class BankAccount {

    private final String accountNo;
    private int balance;
    private final int maxOverdraft;
    private boolean blocked;

    {
        this.blocked = false;
    }

    public static BankAccount withDefaultOverDraft(String accountNo, int balance) {
        return new BankAccount(accountNo, balance, 0);
    }

    public static BankAccount withDefaultBalance(String accountNo, int maxOverdraft) {
        return new BankAccount(accountNo, 0, maxOverdraft);
    }

    public BankAccount(String accountNo) {
        this(accountNo, 0, 0);
    }

    public BankAccount(String accountNo, int balance, int maxOverdraft) {
        if (accountNo.length() < 5) {
            System.out.println("Creating account whit a suspiciously short number");
        }

        if (balance < 0) {
            System.out.println("Shouldn't crate negative balance");
        }
        if (maxOverdraft < 0) {
            System.out.println("Shouldn't crate negative maxOverdraft");
        }

        this.accountNo = accountNo;
        this.balance = balance;
        this.maxOverdraft = maxOverdraft;
    }

    public int getBalance() {
        return balance;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void credit(int amount) {
        if (blocked) {
            System.out.println("Account is blocked");
            return;
        }

        balance += amount;
    }

    public void debit(int amount) {

        if (blocked) {
            System.out.println("Account is blocked");
            return;
        }

        if (balance < amount) {
            System.out.println("Cannot withdraw more than you have");
        } else {
            balance -= amount;
        }
    }

    public String makeSummary() {
        return (isBlocked() ? "Blocked " : "")
                + "Account: " + accountNo + ", balance: " + balance +
                "\nmax over draft: " + maxOverdraft;
    }
}