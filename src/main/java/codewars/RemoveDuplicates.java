package codewars;

/*
    https://www.codewars.com/kata/57a5b0dfcf1fa526bb000118/solutions/java

    Определите функцию, которая удаляет дубликаты из массива неотрицательных
    чисел и возвращает его в качестве результата.

    Порядок следования должен оставаться прежним.

    Примеры:

        Input -> Output
        [1, 1, 2] -> [1, 2]
        [1, 2, 1, 1, 3, 2] -> [1, 2, 3]
 */

import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] array1 = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10};
        int[] result1 = distinctV4(array1);
        System.out.println(Arrays.toString(result1));

        int[] array2 = {2, 2, 4, 4, 6, 6, 8, 8, 10, 10};
        int[] result2 = distinctV4(array2);
        System.out.println(Arrays.toString(result2));

        int[] array3 = {2, 2, 6, 6, 10,};
        int[] result3 = distinctV4(array3);
        System.out.println(Arrays.toString(result3));
    }

    public static int[] distinct(int[] array) {

        if (array.length == 0) {
            return new int[0];
        }

        int[] result = new int[array.length];
        int index = 0;

        for (int k : array) {

            boolean isDuplicate = false;

            for (int j = 0; j < index; j++) {
                if (k == result[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                result[index++] = k;
            }
        }

        int[] finalResult = new int[index];

        System.arraycopy(result, 0, finalResult, 0, index);

        return finalResult;
    }

    public static int[] distinctV2(int[] array) {

        if (array == null || array.length == 0) {
            return new int[0];
        }

        Set<Integer> uniqueElements = new HashSet<>();

        for (int value : array) {
            uniqueElements.add(value);
        }

        return uniqueElements.stream()
                .mapToInt(Integer::intValue)
                .sorted()
                .toArray();
    }

    public static int[] distinctV3(int[] array) {

        if (array == null || array.length == 0) {
            return new int[0];
        }

        LinkedHashSet<Integer> uniqueElements = new LinkedHashSet<>();

        for (int value : array) {
            uniqueElements.add(value);
        }

        int[] result = new int[uniqueElements.size()];

        int index = 0;

        for (int value : uniqueElements) {
            result[index++] = value;
        }

        return result;
    }

    public static int[] distinctV4(int[] array) {

//        return Arrays.stream(array).distinct().toArray();

//        import static java.util.stream.IntStream.of ;
//        return of(array).distinct().toArray();

        HashSet<Integer> set = new HashSet<>();

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int n : array) {
            if (!set.contains(n)) {
                set.add(n);
                arrayList.add(n);
            }
        }

        return arrayList.stream()
                .mapToInt(i -> i)
                .toArray();
    }
}