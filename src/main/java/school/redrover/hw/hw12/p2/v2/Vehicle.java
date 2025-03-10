package school.redrover.hw.hw12.p2.v2;

public abstract class Vehicle {

    private final String model;
    private final int maxSpeed;

    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    // Общий метод для всех транспортных средств
    public abstract void move();

    // Общие геттеры
    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
