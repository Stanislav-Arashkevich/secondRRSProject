package codewars;

public class TwoSignsAfterPoint {

    public static double twoDecimalPlaces(double number) {

        double pointTwo = Math.pow(10, 2);

        return (number * pointTwo) / pointTwo;

//        BigDecimal bdDown = new BigDecimal(Double.toString(number))
//                .setScale(2, RoundingMode.DOWN);
//
//        return bdDown.doubleValue();
    }
}
