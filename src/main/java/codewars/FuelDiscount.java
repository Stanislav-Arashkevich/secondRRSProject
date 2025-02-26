package codewars;

public class FuelDiscount {

    public static double calculateTotalCost(double litres, double pricePerLitre) {

        int discount = (int) (litres / 2) * 5;

        if (discount > 25) {
            discount = 25;
        }

        double totalCost = litres * (pricePerLitre - discount / 100.0);

        return Math.round(totalCost * 100.0) / 100.0;

        //return litres * (price - Math.min(litres / 2 * 0.05, 0.25));
    }
}
