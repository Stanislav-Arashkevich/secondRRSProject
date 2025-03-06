package school.redrover.hw.hw9;

public class EmployeeHW9 {

    private final String empName;
    private int empAge;
    private String empSex;
    private final double dailySalary;

    public EmployeeHW9(String empName, double dailySalary) {
        this(empName, 0, "unknown", dailySalary);
    }

    public EmployeeHW9(String empName, int empAge, String empSex, double daySalary) {
        this.empName = empName;
        this.empAge = empAge;
        this.empSex = empSex;
        this.dailySalary = daySalary;
    }

    public double getSalaryForMonthName(MonthHW9[] monthsArr, String monthName) {

        double monthSalary = 0;

        for (MonthHW9 month : monthsArr) {
            if (month.getNameOfMonth().equals(monthName)) {
                monthSalary = getMonthlySalary(month);
            } else {
                System.out.println("No hands? No candy stands!");
            }
        }

        return monthSalary;
    }

    public double getSalary(MonthHW9[] months) {
        return getBaseSalary(months);
    }

    public double getBaseSalary(MonthHW9[] months) {
        double salary = 0;
        for (MonthHW9 month : months) {
            salary = getMonthlySalary(month);
        }
        return salary;
    }

    public double getMonthlySalary(MonthHW9 month) {
        return month.getWorkDays() * getDailySalary();
    }

    public ManagerHW9 convertToManager(int numberOfSubordinates) {

        if (this.getEmpName() == null || this.getDailySalary() <= 0) {
            throw new IllegalArgumentException("Compulsory fields are not filled");
        }

        return new ManagerHW9(
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
