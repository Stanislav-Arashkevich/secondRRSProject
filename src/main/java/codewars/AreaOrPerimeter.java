package codewars;

public class AreaOrPerimeter {

    public static int areaOrPerimeter(int a, int b) {

        if (a == b) {
            return a * a;
        }

        return 2 * (a + b);
    }
}