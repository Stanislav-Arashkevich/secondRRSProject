package school.redrover.hw.hw10;

public class DirectorHW10 extends ManagerHW10 {

    public DirectorHW10(String name, double dailySalary, int numOfSubordinates) {

        super(name, dailySalary, numOfSubordinates);
        super.setEmpAge(0);
        super.setEmpSex("Unknown");
    }

    @Override
    public double getSalary(MonthHW10[] months) {

        double baseSalary = super.getSalary(months);
        return baseSalary * (1 + getNumOfSubordinates() * 0.03);
    }

    @Override
    public double getSalaryForOneMonth(MonthHW10[] monthsArr, String monthName) {

        double base = super.getSalaryForOneMonth(monthsArr, monthName);
        return base * (1 + getNumOfSubordinates() * 0.03);
    }
}