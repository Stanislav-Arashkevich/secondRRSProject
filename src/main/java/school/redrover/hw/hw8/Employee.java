package school.redrover.hw.hw8;

/*
    Необходимо создать класс Employee с полями: имя, возраст, пол и ЗП в день.
    Класс должен иметь метод - getSalary(Month[] monthArray), метод возвращает зарплату за те месяцы,
    которые были переданы в качестве аргумента.
 */

public class Employee {

    private final String empName;
    private final int empAge;
    private final String empSex;
    private final double daySalary;

    public Employee(String empName, int empAge, String empSex, double daySalary) {
        this.empName = empName;
        this.empAge = empAge;
        this.empSex = empSex;
        this.daySalary = daySalary;
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

    public double getDaySalary() {
        return daySalary;
    }

    public double getSalaryForMonthName(Month[] monthsArr, String monthName) {

        double monthSalary = 0;

        for (Month month : monthsArr) {
            if (month.getNameOfMonth().equals(monthName)) {
                monthSalary = getMonthlySalary(month);
            } else {
                System.out.println("No hands? No candy stands!");
            }
        }

        return monthSalary;
    }

    public double getSalary(Month[] months) {
        return getBaseSalary(months);
    }

    public double getBaseSalary(Month[] months) {
        double salary = 0;
        for (Month month : months) {
            salary = getMonthlySalary(month);
        }
        return salary;
    }

    public double getMonthlySalary(Month month) {
        return month.getWorkDays() * getDaySalary();
    }
}