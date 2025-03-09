package school.redrover.hw.hw11.hw11_2;

public class ArrPlusArr {

    public static int arrayPlusArray(int[] arr1, int[] arr2) {

        int sum = 0;

        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i] + arr2[i];
        }

        return sum;

//        return IntStream
//                .concat(Arrays.stream(arr1), Arrays.stream(arr2))
//                .sum();
    }
}
