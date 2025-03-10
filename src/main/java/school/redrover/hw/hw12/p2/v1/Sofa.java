package school.redrover.hw.hw12.p2.v1;

public final class Sofa extends FurnitureForSitting {

    private final boolean isConvertible;

    public Sofa(String color, String material, int price, int cushionLength, int backrestHeight, int maxWeight, boolean isConvertible) {
        super(color, material, price, cushionLength, backrestHeight, maxWeight);
        this.isConvertible = isConvertible;
    }


    @Override
    public void adjustComfort() {

        if (isConvertible) {
            System.out.println("Раскладываем спинку в положение для сна");
        } else {
            System.out.println("Возможно только отдыхать сидя");
        }
    }

    @Override
    public int getSeatingCapacity() {
        return 3;
    }

    @Override
    protected void howToUse() {
        if (isConvertible) {
            System.out.println("Раскладываем спинку и получаем двуспальные место");
        } else {
            System.out.println("Возможно только отдыхать сидя");
        }
    }

    @Override
    public void assemble() {
        System.out.println("Собираем каркас и крепим подушки и подлокотники");
    }

    public boolean isConvertible() {
        return isConvertible;
    }
}