package school.redrover.hw.hw12.p1;

public final class DirectorHW12 extends BaseEmployee {

    private final int numOfSubordinates;

    public static final double SALARY_RATIO = 0.03;

    public DirectorHW12(String name, double dailySalary, int numOfSubordinates) {

        super(name, 0, "Unknown", dailySalary);
        this.numOfSubordinates = numOfSubordinates;
    }

    @Override
    public double getSalary(MonthHW12[] months) {

        double baseSalary = super.getSalary(months);
        return baseSalary * (1 + numOfSubordinates * SALARY_RATIO);
    }

    @Override
    public double getSalaryForOneMonth(MonthHW12[] monthsArr, String monthName) {

        double base = super.getSalaryForOneMonth(monthsArr, monthName);
        return base * (1 + numOfSubordinates * SALARY_RATIO);
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