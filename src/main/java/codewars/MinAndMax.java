package codewars;

/*
    В этом небольшом задании вам дана строка чисел, разделённых пробелами, и нужно вернуть
    самое большое и самое маленькое числа.

    Примеры
        highAndLow("1 2 3 4 5") // return "5 1"
        highAndLow("1 2 -3 4 5") // return "5 -3"
        highAndLow("1 9 3 4 -5") // return "9 -5"

    Примечания
        Все номера действительны Int32, нет необходимости их подтверждать.
        Во входной строке всегда будет хотя бы одно число.
        В выходной строке должно быть два числа, разделённых одним пробелом, причём большее число должно стоять первым.
 */

import java.util.*;

import static java.util.Arrays.stream;

public class MinAndMax {

    public static void main(String[] args) {

        String nums = "8 3 -5 42 -1 0 0 -9 4 7 4 -4";
        System.out.println(minAndMax(nums));
    }

    public static String minAndMax(String numbers) {

        List<String> numList = new ArrayList<>(stream(numbers.split(" ")).toList());

        numList.sort(Comparator.comparingInt(Integer::parseInt));

        return numList.get(numList.size() - 1) + " " + numList.get(0);

//        List<Integer> nums = Arrays.stream(numbers.split(" ")).map(Integer::parseInt).toList();
//        return "%s %s".formatted(Collections.max(nums), Collections.min(nums));

//        String[] nums = numbers.split(" ");
//
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//
//        for (String num : nums) {
//            int val = Integer.parseInt(num);
//            if (val < min) {
//                min = val;
//            }
//            if (val > max) {
//                max = val;
//            }
//        }
//
//        return String.format("%d %d", max, min);
    }
}
