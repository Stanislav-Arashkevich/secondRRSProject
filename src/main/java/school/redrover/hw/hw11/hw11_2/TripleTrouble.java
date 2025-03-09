package school.redrover.hw.hw11.hw11_2;

public class TripleTrouble {

    public static String tripleTrouble(String one, String two, String three) {

        StringBuilder stringBuilder = new StringBuilder();

        int minLength = Math.min(one.length(), Math.min(two.length(), three.length()));

        for (int i = 0; i < minLength; i++) {

            if (i < one.length()) {
                stringBuilder.append(one.charAt(i));
            }
            // Добавляем символ из второй строки, если он есть
            if (i < two.length()) {
                stringBuilder.append(two.charAt(i));
            }
            // Добавляем символ из третьей строки, если он есть
            if (i < three.length()) {
                stringBuilder.append(three.charAt(i));
            }
        }

        return String.valueOf(stringBuilder);
    }
}
