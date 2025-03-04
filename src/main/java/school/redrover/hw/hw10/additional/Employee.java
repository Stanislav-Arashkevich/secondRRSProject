package school.redrover.hw.hw10.additional;

import java.util.List;
import java.util.Objects;

public class Employee {

    private final String name;
    private int age;
    private String gender;
    private final double dailySalary;

    protected double calculateBaseSalary(List<Month> months) {

        return months.stream()
                .mapToDouble(month -> dailySalary * month.workDays())
                .sum();
    }

    protected double calculateSalaryForMonth(Month month) {
        return dailySalary * month.workDays();
    }

    public Employee(String name, int age, String gender, double dailySalary) {

        if (Objects.isNull(name) || name.isBlank() || dailySalary <= 0) {
            throw new IllegalArgumentException("Имя не должно быть пустым, " +
                    "а дневная зарплата должна быть положительной");
        }

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dailySalary = dailySalary;
    }

    public Employee(String name, double dailySalary) {
        this(name, 0, "unknown", dailySalary);
    }

    public double getSalary(List<Month> months) {
        return calculateBaseSalary(months);
    }

    public double getSalaryForMonth(Month month) {
        if (month == null) {
            System.out.println("Месяц не найден!");
            return 0.0;
        }
        return calculateSalaryForMonth(month);
    }

    public Manager convertToManager(int numberOfSubordinates) {
        return new Manager(this.name, this.dailySalary, numberOfSubordinates);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getDailySalary() {
        return dailySalary;
    }
}