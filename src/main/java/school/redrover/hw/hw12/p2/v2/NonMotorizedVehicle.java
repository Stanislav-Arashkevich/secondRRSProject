package school.redrover.hw.hw12.p2.v2;

public abstract class NonMotorizedVehicle extends GroundVehicle {

    private final String propulsionType;

    public NonMotorizedVehicle(String model, int maxSpeed,
                               int wheelCount, String propulsionType) {

        super(model, maxSpeed, wheelCount);
        this.propulsionType = propulsionType;
    }

    // Общий метод для транспорта без двигателя
    public abstract void maintain();

    public String getPropulsionType() {
        return propulsionType;
    }
}