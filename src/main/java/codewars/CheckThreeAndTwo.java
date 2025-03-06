package codewars;

/*
Дан массив, содержащий ровно 5 строк "a", "b" или "c"
Проверьте, содержит ли массив три и два одинаковых значения.

Примеры
["a", "a", "a", "b", "b"] ==> true  // 3x "a" and 2x "b"
["a", "b", "c", "b", "c"] ==> false // 1x "a", 2x "b" and 2x "c"
["a", "a", "a", "a", "a"] ==> false // 5x "a"
 */

public class CheckThreeAndTwo {

    public static boolean checkThreeAndTwo(char[] chars) {

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for (char c : chars) {
            switch (c) {
                case 'a' -> count1++;
                case 'b' -> count2++;
                case 'c' -> count3++;
            }
        }

        int[] litters = {count1, count2, count3};

        boolean two = false;
        boolean three = false;

        for (int litter : litters) {
            if (litter == 3) {
                three = true;
            } else if (litter == 2) {
                two = true;
            }
        }

        return  three && two;
    }

    public static void main(String[] args) {
        System.out.println(checkThreeAndTwo(new char[] { 'a', 'a', 'b', 'b', 'b' }));
        System.out.println(checkThreeAndTwo(new char[] { 'a', 'c', 'a', 'c', 'b' }));
        System.out.println(checkThreeAndTwo(new char[] { 'a', 'a', 'a', 'a', 'a' }));
    }
}
