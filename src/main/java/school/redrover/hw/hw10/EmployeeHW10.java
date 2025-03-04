package school.redrover.hw.hw10;

public class EmployeeHW10 {

    private final String empName;
    private int empAge;
    private String empSex;
    private final double dailySalary;

    public EmployeeHW10(String empName, int empAge, String empSex, double daySalary) {
        this.empName = empName;
        this.empAge = empAge;
        this.empSex = empSex;
        this.dailySalary = daySalary;
    }

    public EmployeeHW10(String empName, double dailySalary){
        this(empName, 0, "unknown", dailySalary);
    }

    public double getBaseSalary(MonthHW10[] months) {

        double total = 0;

        for (MonthHW10 month : months) {
            total += dailySalary * month.getWorkDays();
        }

        return total;
    }

    public double getSalaryForOneMonth(MonthHW10[] monthsArr, String monthName) {

        for (MonthHW10 month : monthsArr) {
            if (month.getNameOfMonth().equals(monthName)) {
                return getBaseSalary(new MonthHW10[]{month}) ;
            }
        }

        System.out.println("No hands? No candy stands!");

        return 0;
    }

    protected double getSalary(MonthHW10[] months) {
        return getBaseSalary(months);
    }

    public ManagerHW10 convertToManager(int numberOfSubordinates) {

        if (this.getEmpName() == null || this.getDailySalary() <= 0) {
            throw new IllegalArgumentException("Compulsory fields are not filled");
        }

        return new ManagerHW10(
                this.getEmpName(),
                this.getDailySalary(),
                numberOfSubordinates
        );
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public void setEmpSex(String empSex) {
        this.empSex = empSex;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public String getEmpSex() {
        return empSex;
    }

    public double getDailySalary() {
        return dailySalary;
    }
}