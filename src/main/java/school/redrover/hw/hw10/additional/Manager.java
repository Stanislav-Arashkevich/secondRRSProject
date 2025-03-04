package school.redrover.hw.hw10.additional;

import java.util.List;

public class Manager extends Employee {
    private final int numOfSubordinates;

    public Manager(String name, double dailySalary, int numOfSubordinates) {
        super(name, dailySalary);
        this.numOfSubordinates = numOfSubordinates;
    }

    public int getNumOfSubordinates() {
        return numOfSubordinates;
    }

    @Override
    public double getSalary(List<Month> months) {
        double baseSalary = calculateBaseSalary(months);
        return baseSalary * (1 + numOfSubordinates * 0.01);
    }

    @Override
    public double getSalaryForMonth(Month month) {
        double baseSalary = calculateSalaryForMonth(month);
        return baseSalary * (1 + numOfSubordinates * 0.01);
    }
}