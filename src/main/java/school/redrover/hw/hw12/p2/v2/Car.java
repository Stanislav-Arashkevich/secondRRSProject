package school.redrover.hw.hw12.p2.v2;

public final class Car extends MotorizedVehicle {

    private final int doorCount;

    public Car(String model, int maxSpeed, int wheelCount,
               int enginePower, int doorCount) {

        super(model, maxSpeed, wheelCount, enginePower);
        this.doorCount = doorCount;
    }

    @Override
    public void move() {
        System.out.println("Еду по асфальту");
    }

    @Override
    public void brake() {
        System.out.println("Торможу педалью");
    }

    @Override
    public void refuel() {
        System.out.println("Заправляю бензином");
    }

    public int getDoorCount() {
        return doorCount;
    }
}