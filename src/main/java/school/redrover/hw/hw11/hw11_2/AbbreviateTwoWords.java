package school.redrover.hw.hw11.hw11_2;

public class AbbreviateTwoWords {

    public static String abbrevName(String name) {
        String[] str = name.split(" ");

        char first = Character.toUpperCase(str[0].charAt(0));
        char second = Character.toUpperCase(str[1].charAt(0));

        return first + "." + second;
    }
}