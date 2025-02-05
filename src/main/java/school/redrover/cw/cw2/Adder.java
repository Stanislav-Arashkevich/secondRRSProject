package school.redrover.cw.cw2;

import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {

//        int x = readInt("Enter X");
//        int y = readInt("Enter Y");
//
//        System.out.println(x + y);
//
//        int regular = 20;
//        int doppel = 10;
//        int archer = 10;
//        int lieut = 1;
//        int captain = 1;
//
//        int baseSalary = 4;
//
//        int sum = regular  * baseSalary +
//                (doppel + archer) * baseSalary * 2 +
//                lieut * baseSalary * 10 +
//                captain * baseSalary * 100;
//
//        System.out.println(sum);

        int oranges = 11;
        double half = oranges / 2d;
        int remainder = oranges % 2;
        double testRes = half * 2;

        System.out.println(half);
        System.out.println(remainder);
        System.out.println(testRes);

    }

    static Scanner keyboard = new Scanner(System.in);

    private static int readInt(String message) {

        System.out.print(message + ": ");

        return keyboard.nextInt();
    }
}