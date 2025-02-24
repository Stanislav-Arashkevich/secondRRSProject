package school.redrover.hw.hw7;

public class HW7_3 {

    public static void main(String[] args) {
        double a = 5;
        double b = 3;

        System.out.println(sum(a, b));
        System.out.println(minus(a, b));
        System.out.println(pow(a, b));
        System.out.println(divide(a, b));
    }

    private static double sum(double a, double b){
        return a + b;
    }
    private static double minus(double a, double b){
        return a - b;
    }
    private static double pow(double a, double b){
        return a * b;
    }
    private static double divide(double a, double b){
        return Math.round((a / b) * 100.0) / 100.0;
    }
}
