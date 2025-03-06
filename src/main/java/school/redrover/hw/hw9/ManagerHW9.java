package school.redrover.hw.hw9;

public class ManagerHW9 extends EmployeeHW9 {

    private final int numOfSubordinates;

    public ManagerHW9(String managerName, double dailySalary, int numOfSubordinates) {
        super(managerName, dailySalary);
        super.setEmpAge(0);
        super.setEmpSex("Unknown");
        this.numOfSubordinates = numOfSubordinates;
    }

    public ManagerHW9(String managerName, int managerAge, String managerSex, double daySalary, int numOfSubordinates) {
        super(managerName, managerAge, managerSex, daySalary);
        this.numOfSubordinates = numOfSubordinates;
    }

    @Override
    public double getSalaryForMonthName(MonthHW9[] monthsArr, String monthName) {

        double monthSalary = 0;

        for (MonthHW9 month : monthsArr) {
            if (month.getNameOfMonth().equals(monthName)) {
                monthSalary = getMonthlySalary(month) + (numOfSubordinates * 0.01);
            } else {
                System.out.println("No hands? No candy stands!");
            }
        }

        return monthSalary;
    }

    @Override
    public double getMonthlySalary(MonthHW9 month) {
        return super.getMonthlySalary(month);
    }

    @Override
    public double getSalary(MonthHW9[] months) {
        double base = super.getSalary(months);
        return base * (1 + numOfSubordinates * 0.01);
    }
}