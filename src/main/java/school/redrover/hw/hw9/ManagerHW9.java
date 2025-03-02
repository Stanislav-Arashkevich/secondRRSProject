package school.redrover.hw.hw9;

public class ManagerHW9 extends EmployeeHW9 {

    private final int numOfSubordinates;

    public ManagerHW9(String managerName, int managerAge, String managerSex, double daySalary, int numOfSubordinates) {
        super( managerName, managerAge, managerSex, daySalary);
        this.numOfSubordinates = numOfSubordinates;
    }

    public double getSalary(MonthHW9[] monthsArr, String monthName) {

        double monthSalary = 0;

        for (MonthHW9 month : monthsArr) {
            if (month.getNameOfMonth().equals(monthName)) {
                monthSalary = month.getWorkDays() * getDailySalary() + (numOfSubordinates * 0.01);
            } else {
                System.out.println("No hands? No candy stands!");
            }
        }

        return monthSalary;
    }
}
