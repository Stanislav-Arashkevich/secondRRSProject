package codewars;

/*

    Напишите мне method stringy, которая принимает size и возвращает string чередующихся 1 и 0s.

    Строка должна начинаться с 1.

    Строка с size 6 должна возвращать:'101010'.

    С size 4 должно вернуться: '1010'.

    С size 12 должно вернуться: '101010101010'.

    Размер всегда будет положительным и будет использовать только целые числа.
 */

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringyStrings {

    public static String stringy(int size) {

        if (size < 1) {
            throw new IllegalArgumentException("Size should be > 0");
        }

        return IntStream.range(0, size)
                .mapToObj(i -> String.valueOf((i % 2) ^ 1))
                .collect(Collectors.joining());

//        StringBuilder sb = new StringBuilder();
//
//        for (int i = 1; i <= size; i++) {
//            sb.append(i % 2);
//        }

//        return sb.toString();
    }
}
