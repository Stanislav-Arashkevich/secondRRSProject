package codewars;

/*
Вам дано случайное неотрицательное число, и вы должны вернуть цифры этого числа в массиве в обратном порядке.

Пример (Ввод => Вывод):
35231 => [1,3,2,5,3]
0     => [0]
 */

import java.util.Arrays;

public class ConvertNumberToReversedArrayOfDigits {

    public static int[] digitize(long n) {

        String str = Long.toString(n);

        int[] res = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            res[i] = str.charAt(str.length() - 1 - i) - '0';
        }

        return res;
    }

    public static int[] digit(long n) {

        StringBuilder sb = new StringBuilder(String.valueOf(n));
        sb.reverse();

        int[] res = new int[sb.length()];

        for (int i = 0; i < res.length; i++) {
            res[i] = Integer.parseInt(String.valueOf(sb.charAt(i)));
        }

        return res;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(digit(35231)));
        System.out.println(Arrays.toString(digit(987654321)));
    }
}