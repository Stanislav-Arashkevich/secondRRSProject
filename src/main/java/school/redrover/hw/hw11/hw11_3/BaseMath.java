package school.redrover.hw.hw11.hw11_3;

public class BaseMath {

    public static Integer basicMath(String op, int v1, int v2){

        return switch (op) {
            case "+" -> v1 + v2;
            case "-" -> v1 - v2;
            case "*" -> v1 * v2;
            case "/" -> v1 / v2;
            default -> throw new IllegalArgumentException("Incorrect operator");
        };
    }
}