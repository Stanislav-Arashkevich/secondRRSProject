package school.redrover.cw.cw9;

public class Main {

    public static void main(String[] args) {

        BankAccount checking = new BankAccount("1234567890");

//        checking.accountNo = "1234567890";
        checking.credit(100);
        System.out.println(checking.makeSummary());

        checking.credit(100);
        System.out.println(checking.makeSummary());

        checking.debit(150);
        System.out.println(checking.makeSummary());

        checking.debit(150);
        System.out.println(checking.makeSummary());

        checking.setBlocked(true);
        checking.credit(100);
        System.out.println(checking.makeSummary());

        BankAccount anotherAccount = BankAccount.withDefaultOverDraft("987654321", 1000);
        System.out.println(anotherAccount.makeSummary());

        BankAccount withOverDraft = BankAccount.withDefaultBalance("654321987", 200);
        System.out.println(withOverDraft.makeSummary());

    }
}