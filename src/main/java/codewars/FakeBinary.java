package codewars;

import java.util.stream.Collectors;


/*
    Дана строка из цифр. Вам нужно заменить все цифры меньше 5 на «0», а все цифры от 5 и выше — на «1».
    Верните полученную строку.

    Примечание: входные данные никогда не будут пустой строкой
 */
public class FakeBinary {

    public static String fakeBin(String str) {

        if (str ==  null || str.isEmpty()) {
            throw new IllegalArgumentException("String can't be null or empty");
        }

        StringBuilder result = new StringBuilder();



        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) < '5') {
                result.append("0");
            } else {
                result.append("1");
            }
        }

        return result.toString();
    }
}

/*
    String result = str.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
    return result;
 */

/*
    return str.chars()
                .map(Character::getNumericValue)
                .mapToObj(a -> {
                    if (a < 5) {
                        return "0";
                    } else {
                        return "1";
                    }
                }).collect(Collectors.joining());
 */