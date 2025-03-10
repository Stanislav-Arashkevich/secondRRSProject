package school.redrover.hw.hw12.p2.v1;

public abstract class Furniture {

    private final String color;
    private final String material;
    private final double price;

    protected Furniture(String color, String material, double price) {
        this.color = color;
        this.material = material;
        this.price = price;
    }

    protected abstract void howToUse();

    protected abstract void assemble();

    public String getColor(){
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public double getPrice() {
        return price;
    }
}