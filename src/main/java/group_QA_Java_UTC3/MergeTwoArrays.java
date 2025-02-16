package group_QA_Java_UTC3;

import java.util.Arrays;

public class MergeTwoArrays {

    public static void main(String[] args) {

        int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};

        int[] resultArray = new int[firstArray.length + secondArray.length];

        for (int i = 0; i < firstArray.length; i++) {
            resultArray[i] = firstArray[i];
        }

        for (int i = 0; i < secondArray.length; i++) {
            resultArray[firstArray.length + i] = secondArray[i];
        }

//        v.2
//        System.arraycopy(firstArray, 0, resultArray, 0, firstArray.length);
//        System.arraycopy(secondArray, 0, resultArray, firstArray.length, secondArray.length);

        System.out.println(Arrays.toString(resultArray));
    }
}