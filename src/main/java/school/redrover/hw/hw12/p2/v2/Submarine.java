package school.redrover.hw.hw12.p2.v2;

public final class Submarine extends WaterVehicle {

    private final int maxDepth;

    public Submarine(String model, int maxSpeed, String buoyancyType, int maxDepth) {

        super(model, maxSpeed, buoyancyType);
        this.maxDepth = maxDepth;
    }

    @Override
    public void move() {
        System.out.println("Погружаюсь под воду");
    }

    @Override
    public void anchor() {
        System.out.println("Использую якорь для подводных аппаратов");
    }

    public int getMaxDepth() {
        return maxDepth;
    }
}