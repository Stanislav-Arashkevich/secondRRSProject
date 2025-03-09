package school.redrover.hw.hw11.hw11_3;

public class CorrectLitter {

    public static String correct(String string) {

        return string
                .replace('5', 'S')
                .replace('0', 'O')
                .replace('1', 'I');
    }
}