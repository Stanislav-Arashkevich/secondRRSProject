package codewars;

import java.util.Arrays;
import java.util.function.Function;

public class MultiplyAllInArray {

    public static Function<Integer, int[]> multiplyAll(int[] array) {

        if (array.length == 0) {
            return integer -> new int[0];
        }

        return integer -> Arrays.stream(array)
                .map(j -> j * integer)
                .toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(multiplyAll(new int[]{1, 2, 3}).apply(2)));
    }

    public static Function<Integer, int[]> multiplyAll1(int[] array) {

        if (array.length == 0) {
            return new Function<Integer, int[]>() {
                @Override
                public int[] apply(Integer integer) {
                    return new int[0];
                }
            };
        }

        return new Function<Integer, int[]>() {
            @Override
            public int[] apply(Integer integer) {

                int[] res = new int[array.length];

                for (int i = 0; i < array.length; i++) {
                    res[i] = array[i] * integer;
                }

                return res;
            }
        };
    }
}
