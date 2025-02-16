package group_QA_Java_UTC3;

/*
    Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа

    Пример:
        [4, 6]
        4 = 2
        5 = -
        6 = 2 3
 */

public class numberDividers {

    public static void main(String[] args) {

        for (int i = 4; i <= 19; i++) {

            System.out.print(i + " = ");

            int count = 0;

            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    System.out.print(j + " ");
                    count++;
                }
            }

            if (count == 0){
                System.out.print("-");
            }

            System.out.println();
        }
    }
}