package school.redrover.hw.hw8;

public class Manager {

    private final String managerName;
    private final int managerAge;
    private final String managerSex;
    private final double daySalary;
    private final int numOfSubordinates;

    public Manager(String managerName, int managerAge, String managerSex, double daySalary, int numOfSubordinates) {
        this.managerName = managerName;
        this.managerAge = managerAge;
        this.managerSex = managerSex;
        this.daySalary = daySalary;
        this.numOfSubordinates = numOfSubordinates;
    }

    public String getManagerName() {
        return managerName;
    }

    public int getManagerAge() {
        return managerAge;
    }

    public String getManagerSex() {
        return managerSex;
    }

    public double getDaySalary() {
        return daySalary;
    }

    public double getSalary(Month[] monthsArr, String monthName) {

        double monthSalary = 0;

        for (Month month : monthsArr) {
            if (month.getNameOfMonth().equals(monthName)) {
                monthSalary = month.getWorkDays() * getDaySalary() + (numOfSubordinates * 0.01);
            } else {
                System.out.println("No hands? No candy stands!");
            }
        }

        return monthSalary;
    }
}
