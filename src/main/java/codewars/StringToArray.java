package codewars;

import java.util.Arrays;

public class StringToArray {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(stringToArr("Robin Singh")));
        System.out.println(Arrays.toString(stringToArr("I love arrays they are my favorite")));
    }

    public static String[] stringToArr(String str) {

        return str.split(" ");
    }
}