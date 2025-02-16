package school.redrover.hw.hw6;


import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class TaskAdditional2 {

    public static void main(String[] args) {

        int size = 5;
        int[][] arr  = new int[size][size];

        AtomicInteger count = new AtomicInteger(1);
        for (int[] row : arr) {
            Arrays.setAll(row, column -> count.getAndIncrement());
        }

//        System.out.println(Arrays.deepToString(arr));

        //sys.out
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.printf("%d\t", anInt);
            }
            System.out.println();
        }

        System.out.println();

        //replace values
        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {

                if (x > y) {
                    int temp = arr[y][x];
                    arr[y][x] = arr[x][y];
                    arr[x][y] = temp;
                }
            }
        }

        //sys.out
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.printf("%d\t", anInt);
            }
            System.out.println();
        }

//        System.out.println(Arrays.deepToString(arr));
    }
}

/*
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = count++;
//            }
//        }

 */