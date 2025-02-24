package school.redrover.hw.hw7;

public class HW7_1 {

    public static void main(String[] args) {

        System.out.println("---Tasks---");
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        int sum = 0;

        for (int i : array) {
            sum += i;
        }

        System.out.println(sum + "\n");

        System.out.println("---Task2---");
        int max = Integer.MIN_VALUE;
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }

        System.out.println(max + "\n");

        System.out.println("---Task3---");
        int min = Integer.MAX_VALUE;
        for (int i : array) {
            if (i < min) {
                min = i;
            }
        }

        System.out.println(min + "\n");

        System.out.println("---Task4---");
        double average = 0;
        for (int i : array) {
            average += i;
        }

        System.out.println(Math.round((average / array.length) * 100.0) / 100.0 + "\n");

        System.out.println("---Task5---");
        int[][] arr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

        int accumulator = 0;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                accumulator += anInt;
            }
        }

        System.out.println(accumulator + "\n");

        System.out.println("---Task6---");
        int maxInDoubleArr = 0;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > maxInDoubleArr) {
                    maxInDoubleArr = anInt;
                }
            }
        }

        System.out.println(maxInDoubleArr + "\n");

        System.out.println("---Task7---");
        int quantity = 0;
        for (int[] ints : arr) {
            quantity += ints.length;
        }

        System.out.println(quantity + "\n");
    }
}