package school.redrover.hw.hw12.p2.v2;

public abstract class MotorizedVehicle extends GroundVehicle {

    private final int enginePower;

    public MotorizedVehicle(String model, int maxSpeed,
                            int wheelCount, int enginePower) {

        super(model, maxSpeed, wheelCount);
        this.enginePower = enginePower;
    }

    // Общий метод для транспорта с двигателем
    public abstract void refuel();

    public int getEnginePower() {
        return enginePower;
    }
}