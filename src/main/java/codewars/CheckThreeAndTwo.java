package codewars;

/*
Дан массив, содержащий ровно 5 строк "a", "b" или "c"
Проверьте, содержит ли массив три и два одинаковых значения.

Примеры
["a", "a", "a", "b", "b"] ==> true  // 3x "a" and 2x "b"
["a", "b", "c", "b", "c"] ==> false // 1x "a", 2x "b" and 2x "c"
["a", "a", "a", "a", "a"] ==> false // 5x "a"
 */

import java.nio.CharBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CheckThreeAndTwo {

    public static boolean checkThreeAndTwo(char[] chars) {

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for (char c : chars) {
            switch (c) {
                case 'a' -> count1++;
                case 'b' -> count2++;
                case 'c' -> count3++;
            }
        }

        int[] litters = {count1, count2, count3};

        boolean two = false;
        boolean three = false;

        for (int litter : litters) {
            if (litter == 3) {
                three = true;
            } else if (litter == 2) {
                two = true;
            }
        }

        return  three && two;
    }

    public static void main(String[] args) {
        System.out.println(checkThreeAndTwo(new char[] { 'a', 'a', 'b', 'b', 'b' }));
        System.out.println(hasThreeAndTwo1(new char[] { 'a', 'c', 'a', 'c', 'b' }));
        System.out.println(hasThreeAndTwo2(new char[] { 'a', 'a', 'a', 'a', 'a' }));
        System.out.println(hasThreeAndTwo3(new char[] { 'a', 'a', 'b', 'b', 'b' }));
        System.out.println(hasThreeAndTwo4(new char[] { 'a', 'c', 'a', 'c', 'b' }));
        System.out.println(hasThreeAndTwo5(new char[] { 'a', 'a', 'a', 'a', 'a' }));
    }

    public static boolean hasThreeAndTwo1(char[] arr) {
        int[] counts = new int[3]; // для 'a', 'b', 'c'

        // Подсчёт количества каждого символа
        for (char c : arr) {
            counts[c - 'a']++;
        }

        // Проверка наличия ровно трёх и двух одинаковых символов
        boolean hasThree = false;
        boolean hasTwo = false;

        for (int count : counts) {
            if (count == 3) {
                hasThree = true;
            }
            if (count == 2) {
                hasTwo = true;
            }
        }

        return hasThree && hasTwo;
    }

    public static boolean hasThreeAndTwo2(char[] arr) {
        Map<Character, Integer> countMap = new HashMap<>();

        // Подсчёт количества каждого символа
        for (char c : arr) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        // Проверка наличия ровно трёх и двух одинаковых символов
        boolean hasThree = false;
        boolean hasTwo = false;

        for (int count : countMap.values()) {
            if (count == 3) {
                hasThree = true;
            }
            if (count == 2) {
                hasTwo = true;
            }
        }

        return hasThree && hasTwo;
    }

    public static boolean hasThreeAndTwo3(char[] arr) {
        Map<Character, Long> countMap = new String(arr)
                .chars() // Преобразуем строку в IntStream<
                .mapToObj(c -> (char) c) // Преобразуем IntStream в Stream<Character>
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        boolean hasThree = countMap.containsValue(3L);
        boolean hasTwo = countMap.containsValue(2L);

        return hasThree && hasTwo;
    }
    public static boolean hasThreeAndTwo4(char[] arr) {
        Map<Character, Long> countMap = CharBuffer.wrap(arr)
                .chars()
                .mapToObj(c -> (char) c) // Преобразуем IntStream в Stream<Character>
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        boolean hasThree = countMap.containsValue(3L);
        boolean hasTwo = countMap.containsValue(2L);

        return hasThree && hasTwo;
    }
    public static boolean hasThreeAndTwo5(char[] arr) {
        Map<Character, Long> countMap = IntStream.range(0, arr.length)
                .mapToObj(i -> arr[i])
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        boolean hasThree = countMap.values().contains(3L);
        boolean hasTwo = countMap.values().contains(2L);

        return hasThree && hasTwo;
    }
}