package school.redrover.hw.hw12.p2.v1;

public final class Chair extends FurnitureForSitting {

    private final boolean hasBackrest;

    public Chair(String color, String material, int price,
                 int cushionLength, int backrestHeight, int maxWeight, boolean hasBackrest) {

        super(color, material, price, cushionLength, backrestHeight, maxWeight);

        this.hasBackrest = hasBackrest;
    }

    @Override
    protected void adjustComfort() {
        System.out.println("Стул может регулироваться по высоте");
    }

    @Override
    protected void howToUse() {

        if (hasBackrest) {
            System.out.println("Стул офисный для работы за компьютером");
        } else {
            System.out.println("Табурет бытовой");
        }
    }

    @Override
    protected void assemble() {
        System.out.println("Собирать ножки, сиденье выставить в газлифт и прикрутить его к спинке");
    }
}