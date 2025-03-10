package school.redrover.hw.hw12.p2.v2;

public abstract class WaterVehicle extends Vehicle {

    private final String buoyancyType;

    public WaterVehicle(String model, int maxSpeed, String buoyancyType) {

        super(model, maxSpeed);
        this.buoyancyType = buoyancyType;
    }

    // Общий метод для водного транспорта
    public abstract void anchor();

    public String getBuoyancyType() {
        return buoyancyType;
    }
}