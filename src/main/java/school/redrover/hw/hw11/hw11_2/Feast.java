package school.redrover.hw.hw11.hw11_2;

public class Feast {

    public static boolean feast(String beast, String dish) {

        if (beast.length() < 2 && dish.length() < 2) {
            return false;
        }

        return beast.charAt(0) == dish.charAt(0) &&
                beast.charAt(beast.length() - 1) == dish.charAt(dish.length() - 1);
    }
}