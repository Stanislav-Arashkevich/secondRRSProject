package codewars;

public class Repeats {

    public static int repeats(int [] arr){
        int sum = 0;

        for (int i : arr) {
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    count++;
                }
            }

            if (count == 0) {
                sum += i;
            }
        }

        return sum;

//        return Arrays.stream(arr)
//                .filter(n -> Arrays.stream(arr)
//                        .filter(x -> x == n)
//                        .count() == 1)
//                .sum();
//        return 2 * IntStream.of(arr).distinct().sum() - IntStream.of(arr).sum();
//        return IntStream.of(arr)
//                .filter(i -> ArrayUtils.indexOf(arr, i) == ArrayUtils.lastIndexOf(arr, i))
//                .sum();
    }

    public static void main(String[] args) {
        System.out.println(repeats(new int []{4,5,7,5,4,8}));
    }
}
