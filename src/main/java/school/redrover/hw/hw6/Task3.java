package school.redrover.hw.hw6;

import java.util.Locale;

public class Task3 {

    public static void main(String[] args) {

        String str = "Посмотрите как Рите нравится ритм".toLowerCase(new Locale("ru", "RU"));
        String str2 = "рит";

        System.out.print("The start index of the substring: ");

        int i = str.indexOf(str2);

        while (i != -1) {
            System.out.printf("%d ", i);
            i = str.indexOf(str2, i + str2.length());
        }
    }
}