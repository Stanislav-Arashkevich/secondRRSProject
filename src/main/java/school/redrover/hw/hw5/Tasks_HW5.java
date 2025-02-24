package school.redrover.hw.hw5;

import java.util.Arrays;

public class Tasks_HW5 {

    public static void main(String[] args) {

        int[] arr = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        //----Tasks----
        for (int j : arr) {
            if (j % 2 != 0) {
                System.out.print(j + " ");
            }
        }
        System.out.println();

        //----Task2----
        for (int j : arr) {
            if (j > 5) {
                System.out.print(j + " ");
            }
        }
        System.out.println();

        //----Task3----
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 15;
        }
        System.out.println(Arrays.toString(arr));

        //----Task*----
        int[] arr1 = {5, 2, 7, 6, 1, 8, 3, 10, 9, 4};

//        for (int i = 0; i < arr1.length / 2; i++) {
//            int temp = arr1[i];
//            arr1[i] = arr1[arr1.length - 1 - i];
//            arr1[arr1.length - 1 - i] = temp;
//        }
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = new int[arr1.length];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr1[arr1.length - 1 - i];
        }
        arr1 = arr2;
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

    }
}
