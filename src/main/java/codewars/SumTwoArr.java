package codewars;

import java.util.Arrays;
import java.util.stream.Stream;

public class SumTwoArr {

    public static int arrayPlusArray(int[] arr1, int[] arr2) {


        return Stream.of(arr1, arr2)
                .flatMapToInt(Arrays::stream)
                .sum();
    }

    public static void main(String[] args) {

        System.out.println(arrayPlusArray(new int[]{1,2,3}, new int[]{4,5,6}));
    }
}

//        int sum1 = Arrays.stream(arr1).sum();
//        int sum2 = Arrays.stream(arr2).sum();
//        return sum1 + sum2;

//        return IntStream.concat(IntStream.of(arr1), IntStream.of(arr2)).sum();