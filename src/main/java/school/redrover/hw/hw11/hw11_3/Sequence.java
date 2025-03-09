package school.redrover.hw.hw11.hw11_3;

import java.util.Arrays;

public class Sequence {

    public static int[] reverse(int n) {

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[arr.length - 1 - i];
        }

        return arr;

//        return IntStream
//                .iterate(n, i -> i - 1).limit(n)
//                .toArray();
//        return IntStream
//                .rangeClosed(1, n)
//                .map(i -> n - i + 1)
//                .toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new int[]{5, 4, 3, 2, 1}));
    }
}