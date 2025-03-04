package school.redrover.hw.hw10;

public class ManagerHW10 extends EmployeeHW10 {

    private final int numOfSubordinates;

    public ManagerHW10(String managerName, double dailySalary, int numOfSubordinates) {
        super(managerName, dailySalary);
        super.setEmpAge(0);
        super.setEmpSex("Unknown");
        this.numOfSubordinates = numOfSubordinates;
    }

    public int getNumOfSubordinates() {
        return numOfSubordinates;
    }

    @Override
    public double getSalary(MonthHW10[] months) {

        double baseSalary = super.getSalary(months);
        return baseSalary * (1 + numOfSubordinates * 0.01);
    }

    @Override
    public double getSalaryForOneMonth(MonthHW10[] monthsArr, String monthName) {

        double base = super.getSalaryForOneMonth(monthsArr, monthName);
        return base * (1 + numOfSubordinates * 0.01);
    }
}