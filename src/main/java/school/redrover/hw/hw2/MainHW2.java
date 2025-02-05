package school.redrover.hw.hw2;

public class MainHW2 {

    public static void main(String[] args) {
//
//        //-------first----------------
//        int a = 5;
//        int b = 2;
//
//        System.out.println("a" + " + " + "b" + " = " + (a + b));
//        System.out.println("a" + " * " + "b" + " = " + (a * b));
//        System.out.println("a" + " - " + "b" + " = " + (a - b));
//        System.out.println("a" + " / " + "b" + " = " + (a / b));
//        System.out.println("a" + " % " + "b" + " = " + (b % a) + "\n");
//
//        System.out.println(a + " is even? - " + isEven(a));
//        System.out.println(b + " is even? -  " + isEven(b) + "\n");
//
//        System.out.println(a + " & " + b);
//        int temp = a;
//        a = b;
//        b = temp;
//        System.out.println(a + " & " + b + "\n");

        //-------second---------------
        int piastres = 2599;
        int piratesTeam = 37;

        //----------------------------
        int goldForTeam = piastres;
        int owner = piastres / 2;
        goldForTeam -= owner;

        int captainJackTheSparrow = goldForTeam / 2;
        goldForTeam -= captainJackTheSparrow;

        int teamSalary = captainJackTheSparrow / (piratesTeam + 1);
        captainJackTheSparrow += teamSalary;
        goldForTeam = goldForTeam - teamSalary * (piratesTeam + 1);

        System.out.printf(
                "Ship owner: %sKg of coins\n" +
                "Jack the Sparrow: %sKg of coins\n" +
                "Coins for pirates: %sKg of coins\n" +
                "Remainder: %sKg of coins\n",
                owner, captainJackTheSparrow, teamSalary, goldForTeam
        );

        double summary = (captainJackTheSparrow + owner + goldForTeam + (teamSalary * piratesTeam));

        System.out.println("\n" + owner + " + " + captainJackTheSparrow + " + "
                + goldForTeam + " + " + (teamSalary * piratesTeam) + " = " + summary + "\n");

        //-------third----------------
        boolean isDivTrue = summary == piastres;
        System.out.println("Divided equally? - " + isDivTrue);

    }

    private static boolean isEven (int num) {
        return num % 2 == 0;
    }
}