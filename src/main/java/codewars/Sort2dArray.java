package codewars;

import java.util.Arrays;

public class Sort2dArray {

    public static int[] flattenAndSort(int[][] array) {

        int totalLength = 0;

        for (int[] ints : array) {
            totalLength += ints.length;
        }

        int[] resSortedArr = new int[totalLength];

        int index = 0;

        for (int[] ints : array) {
            for (int anInt : ints) {
                resSortedArr[index] = anInt;
                index++;
            }
        }

        for (int i = 0; i < resSortedArr.length - 1; i++) {
            for(int j = 0; j < resSortedArr.length - i - 1; j++) {
                if(resSortedArr[j + 1] < resSortedArr[j]) {
                    int swap = resSortedArr[j];
                    resSortedArr[j] = resSortedArr[j + 1];
                    resSortedArr[j + 1] = swap;
                }
            }
        }

        return resSortedArr;
    }

    public static int[] flattenAndSortStream(int[][] array) {
        return Arrays.stream(array)          // Преобразуем двумерный массив в поток массивов int[]
                .flatMapToInt(Arrays::stream) // "Сглаживаем" вложенные массивы в один поток int
                .sorted()             // Сортируем числа по возрастанию
                .toArray();           // Преобразуем поток обратно в массив int[]
    }

    public static void main(String[] args) {

        int[][] arr = new int[][]{
                {3, 2, 1},
                {7, 9, 8},
                {6, 4, 5}
        };

        System.out.println(Arrays.toString(flattenAndSort(arr)));

        int[][] array = {
                {3, 2, 1},
                {4, 6, 5},
                {},
                {9, 7, 8}
        };

        System.out.println(Arrays.toString(flattenAndSortStream(array)));
    }
}