package school.redrover.hw.hw12.p2.v2;

public abstract class GroundVehicle extends Vehicle {

    private final int wheelCount;

    public GroundVehicle(String model, int maxSpeed, int wheelCount) {

        super(model, maxSpeed);
        this.wheelCount = wheelCount;
    }

    // Общий метод для наземного транспорта
    public abstract void brake();

    public int getWheelCount() {
        return wheelCount;
    }
}