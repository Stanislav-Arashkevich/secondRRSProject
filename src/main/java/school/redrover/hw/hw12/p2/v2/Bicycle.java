package school.redrover.hw.hw12.p2.v2;

public final class Bicycle extends NonMotorizedVehicle {

    private final String brakeType;

    public Bicycle(String model, int maxSpeed, int wheelCount,
                   String propulsionType, String brakeType) {

        super(model, maxSpeed, wheelCount, propulsionType);
        this.brakeType = brakeType;
    }

    @Override
    public void move() {
        System.out.println("Кручу педали");
    }

    @Override
    public void brake() {
        System.out.println("Торможу " + brakeType + " тормозом");
    }

    @Override
    public void maintain() {
        System.out.println("Смазываю цепь");
    }
}