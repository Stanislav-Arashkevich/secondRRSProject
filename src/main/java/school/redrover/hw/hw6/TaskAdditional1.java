package school.redrover.hw.hw6;

public class TaskAdditional1 {

    public static void main(String[] args) {

        String[][] array = {
                {"Привет", "всем", "кто"},
                {"изучает", "язык", "программирования"},
                {"java"}
        };

        int count = 0;
        for (String[] strings : array) {
            for (String string : strings) {

                if (!string.contains("е")) {
                    count++;
                }
            }
        }

        System.out.printf("The number of words that do not contain the letter \"e\" = %d", count);
    }
}