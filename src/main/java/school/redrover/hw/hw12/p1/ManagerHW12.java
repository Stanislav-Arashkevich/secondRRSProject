package school.redrover.hw.hw12.p1;

public final class ManagerHW12 extends BaseEmployee {

    BaseEmployee employee;

    private final int subordinates;

    public static final double BONUS_RATE = 0.01;

    public ManagerHW12(String managerName, double dailySalary, int subordinates) {

        super(managerName, 0, "Unknown", dailySalary);
        this.subordinates = subordinates;
    }

    public int getSubordinates() {
        return subordinates;
    }

    @Override
    public double getSalary(MonthHW12[] months) {

        double baseSalary = super.getSalary(months);
        return baseSalary * (1 + getSubordinates() * BONUS_RATE);
    }

    @Override
    public double getSalaryForOneMonth(MonthHW12[] monthsArr, String monthName) {

        double base = super.getSalaryForOneMonth(monthsArr, monthName);
        return base * (1 + getSubordinates() * BONUS_RATE);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public double getDailySalary() {
        return dailySalary;
    }
}