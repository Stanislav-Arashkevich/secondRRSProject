package codewars;

import java.util.Arrays;

public class SheepCount {

    public static int countSheep(Boolean[] arrayOfSheep) {

        return (int) Arrays.stream(arrayOfSheep)
                .filter(b -> b.equals(true))
                .count();
    }

    public static void main(String[] args) {

        Boolean[] sheep = new Boolean[] {
                true, true, true, false, true, true,  true, true, true, false, true,
                false, true, false, false, true, true,  true,  true, true, false,
                false, true,  true
        };

        Boolean[] b1 = new Boolean[] { false, true, true };
        Boolean[] b2 = new Boolean[] {};
        Boolean[] b3 = new Boolean[] { false, null, true, false, null, null, true };
        Boolean[] b4 = new Boolean[] { false, null, null};

        System.out.println(countSheep(sheep));
        System.out.println(countSheep(b1));
        System.out.println(countSheep(b2));
        System.out.println(countSheep(b3));
        System.out.println(countSheep(b4));
    }
}
