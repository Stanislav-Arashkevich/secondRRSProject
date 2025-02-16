package group_QA_Java_UTC3;

/*
    Измени знак элемента массива array на противоположный, если значение этого элемента чётное.
    Пример массива: {-1, 2, 3, -4, -5}
 */


import java.util.Arrays;

public class EvenToOdd {

    public static void main(String[] args) {

        int[] array = {-1, 2, 3, -4, -5};

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] *= -1;
//                array[i] = -array[i];
            }
        }

        System.out.println(Arrays.toString(array));
    }
}