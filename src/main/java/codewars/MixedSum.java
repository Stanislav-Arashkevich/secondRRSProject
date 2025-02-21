package codewars;

import java.util.ArrayList;
import java.util.List;

/*
 * Assume input will be only of Integer or String type
 */

public class MixedSum {

    public static void main(String[] args) {

        List<?> nums = new ArrayList<>(List.of("5", "0", 9, 3, 2, 1, "9", 6, 7));
        System.out.println(sum(nums));
    }

    public static int sum(List<?> mixed) {

        int sum = 0;

        for (Object n : mixed) {

            if (n instanceof Integer) {
                sum += (Integer) n;
            } else if (n instanceof String) {
                try {
                    sum += Integer.parseInt(n.toString());
                } catch (NumberFormatException e) {
                    System.out.println("Incorrect value" + n);
                }
            }
        }

//        return mixed.stream()
//                .map(Object::toString)
//                .map(Integer::valueOf)
//                .reduce(0, (a, b) -> a + b);
//
//        return mixed.stream()
//                .mapToInt(o -> Integer.parseInt(o.toString()))
//                .sum();

//        for (Object obj : mixed) {
//            sum += Integer.parseInt(obj.toString());
//        }

        return sum;
    }
}