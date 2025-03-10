package school.redrover.hw.hw12.p2.v1;

public abstract class FurnitureForStorage extends Furniture {

    private final double volume;
    private final int length;
    private final int width;
    private final int height;

    protected FurnitureForStorage(String color, String material, int price, double volume,
                                  int length, int width, int height) {

        super(color, material, price);
        this.volume = volume;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // Общие методы для мебели для хранения
    protected abstract boolean isClothesWithKey();

    protected abstract void organizeItems();

    protected abstract boolean isArmored();

    public double getVolume() {
        return volume;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}