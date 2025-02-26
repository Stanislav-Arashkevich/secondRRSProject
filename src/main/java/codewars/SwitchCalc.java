package codewars;

public class SwitchCalc {

    public static Double calculate(final double a, final String oper, final double b) {

        if (oper.equals("/") && b == 0) {
            return null;
        }

        return switch (oper) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> Math.abs(a * b);
            case "/" -> a / b;
            default -> null;
        };
    }
}