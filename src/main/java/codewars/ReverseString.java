package codewars;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {

    public static String solution(String str) {

//        StringBuilder reversed = new StringBuilder();

//        for (int i = str.length() - 1; i >= 0; i--) {
//            reversed.append(str.charAt(i));
//        }
//        return reversed.toString();

//        return new StringBuilder(str).reverse().toString();

        return Stream.of(str)
                .map(s -> new StringBuilder(s).reverse())
                .collect(Collectors.joining());
    }
}