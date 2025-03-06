package codewars;

public class DuplicateEncoder {

    static String encode(String word) {

        word = word.toLowerCase();

        char[] chars = word.toCharArray();

        StringBuilder sb = new StringBuilder();

        for (char aChar : chars) {
            sb.append(word.indexOf(aChar) == word.lastIndexOf(aChar) ? "(" : ")");
        }

        return sb.toString();

//        return word.toLowerCase()
//                .chars()
//                .mapToObj(i -> String.valueOf((char)i))
//                .map(i -> word.toLowerCase().indexOf(i) == word.toLowerCase().lastIndexOf(i) ? "(" : ")")
//                .collect(Collectors.joining());
    }

//    public static void main(String[] args) {
//
//        System.out.println(encode("rsdefasdfghtyjy5cfdgsdfgede"));
//    }
}