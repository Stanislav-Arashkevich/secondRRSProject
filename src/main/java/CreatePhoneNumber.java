import java.util.Arrays;
import java.util.stream.Collectors;

public class CreatePhoneNumber {

    public static String createPhoneNumber(int[] numbers) {

        String numbersStr = Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining());

        return String.format("(%s) %s-%s",
                numbersStr.substring(0, 3),
                numbersStr.substring(3, 6),
                numbersStr.substring(6));
    }

    public static void main(String[] args) {

        System.out.println(createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
}


//        StringBuilder sb = new StringBuilder();
//
//        for (int i = 0; i < numbers.length; i++) {
//            if (i == 0) {
//                sb.append("(").append(numbers[i]);
//            } else if (i == 2) {
//                sb.append(numbers[i]).append(") ");
//            } else if (i == 5) {
//                sb.append(numbers[i]).append("-");
//            } else {
//                sb.append(numbers[i]);
//            }
//        }

//        return sb.toString();

//        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", IntStream.of(numbers).boxed().toArray());

//        return Arrays.stream(numbers)
//                .mapToObj(String::valueOf)
//                .collect(Collectors.joining())
//                .replaceFirst("^(\\d{3})(\\d{3})(\\d{4})$", "($1) $2-$3");//

