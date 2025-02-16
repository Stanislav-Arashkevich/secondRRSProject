package school.redrover.hw.hw6;

public class Task1 {

    public static void main(String[] args) {

        String str = "Перестановочный алгоритм быстрого действия";

        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'о') {
                count++;
                System.out.print("o");
            }
        }

        System.out.printf("%nTotal liter 'o' : %d", count);
    }
}