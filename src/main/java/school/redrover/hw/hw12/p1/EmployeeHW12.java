package school.redrover.hw.hw12.p1;

public final class EmployeeHW12 extends BaseEmployee {

    public EmployeeHW12(String empName, int empAge, String empSex, double daySalary) {
        super(empName, empAge, empSex, daySalary);
    }

    public EmployeeHW12(String empName, double dailySalary) {
        this(empName, 0, "unknown", dailySalary);
    }

    @Override
    public double getSalary(MonthHW12[] months) {
        return getBaseSalary(months);
    }

    @Override
    public double getBaseSalary(MonthHW12[] months) {

        double total = 0;

        for (MonthHW12 month : months) {
            total += getDailySalary() * month.getWorkDays();
        }

        return total;
    }

    @Override
    public double getSalaryForOneMonth(MonthHW12[] monthsArr, String monthName) {

        for (MonthHW12 month : monthsArr) {
            if (month.getNameOfMonth().equals(monthName)) {
                return getBaseSalary(new MonthHW12[]{month});
            }
        }

        System.out.println("No hands? No candy stands!");

        return 0;
    }

    public ManagerHW12 convertToManager(int numberOfSubordinates) {

        if (this.getName() == null || this.getDailySalary() <= 0) {
            throw new IllegalArgumentException("Compulsory fields are not filled");
        }

        return new ManagerHW12(
                this.getName(),
                this.getDailySalary(),
                numberOfSubordinates
        );
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public double getDailySalary() {
        return dailySalary;
    }
}