package school.redrover.hw.hw7.codewars;

public class Tasks {

    public static int doubleInteger(int i) {

        return i * 2;
    }

    public static boolean isLove(final int flower1, final int flower2) {

        return flower1 % 2 != flower2 % 2;
    }

    public static String numberToString(int num) {

        return String.valueOf(num);
    }

    public static int findSmallestInt(int[] args) {

        int min = Integer.MAX_VALUE;

        for (int arg : args) {
            if (arg < min) {
                min = arg;
            }
        }

        return min;
    }

    public static String countingSheep(int num) {

        StringBuilder s = new StringBuilder();

        for (int i = 0; i < num; i++) {
            if (num == 0){
                return "";
            } else {
                s.append(i + 1).append(" sheep...");
            }
        }

        return s.toString();
    }
}