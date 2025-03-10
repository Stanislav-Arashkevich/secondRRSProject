package school.redrover.hw.hw12.p2.v1;

public abstract class FurnitureForSitting extends Furniture {

    private final int cushionLength;
    private final int backrestHeight;
    private final int maxWeight;

    protected FurnitureForSitting(String color, String material, int price,
                                  int cushionLength, int backrestHeight, int maxWeight) {

        super(color, material, price);
        this.cushionLength = cushionLength;
        this.backrestHeight = backrestHeight;
        this.maxWeight = maxWeight;
    }

    // Общие методы для мебели, на которой сидят
    protected abstract void adjustComfort();

    public abstract int getSeatingCapacity();

    public int getCushionLength(){
        return cushionLength;
    }

    public int getBackrestHeight() {
        return backrestHeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }
}