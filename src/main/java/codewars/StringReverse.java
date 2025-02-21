package codewars;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringReverse {

    public static String wordsReversed(String str) {


        List<String> words = Arrays.asList(str.split(" "));

        Collections.reverse(words);

        return String.join(" ", words);

//        return Arrays.stream(str.split(" ")).reduce((x, y) -> y + " " + x).orElse("");

//        String[] words = str.split(" ");
//
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = words.length - 1; i >= 0; i--) {
//
//            sb.append(words[i]);
//
//            if (i != 0) {
//                sb.append(" ");
//            }
//        }
//
//        return sb.toString();
    }

    public static void main(String[] args) {

        System.out.println(wordsReversed("Hello, world!"));
    }
}
