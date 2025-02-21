package codewars;

import java.util.Arrays;

/*
    Ваша задача — вычислить сумму разностей между последовательными парами в массиве в порядке убывания.

        Пример:
            [2, 1, 10]  -->  9
            В порядке убывания: [10, 2, 1]

            Сумма: (10 - 2) + (2 - 1) = 8 + 1 = 9

    Если массив пуст или содержит только один элемент, результатом должно быть 0 (Zero).
 */
public class SumOfDifferencesInArr {

    public static int sumOfDifferences(int[] arr) {

        Arrays.sort(arr);
        return arr.length <= 1 ? 0 : arr[arr.length-1] - arr[0];

//        if (arr.length <= 1) {
//            return 0;
//        }
//
//        int[] sortedArr = Arrays.stream(arr)
//                .boxed() // Transform to Integer
//                .sorted((a, b) -> b - a) // or .sorted(Comparator.reverseOrder())
//                .mapToInt(Integer::intValue) // Transform to int
//                .toArray();
        //or
//        int[] sortedArr = IntStream.range(0, arr.length)
//                .map(i -> arr[arr.length - 1 - i])
//                .toArray();
//
//        return IntStream.range(0, sortedArr.length - 1)
//                .map(i -> sortedArr[i] - sortedArr[i + 1])
//                .sum();

//        int sum = 0;
//        for (int i = arr.length - 1; i > 0; i--) {
//            sum += arr[i] - arr[i - 1];
//        }
//
//        return sum;
    }
}