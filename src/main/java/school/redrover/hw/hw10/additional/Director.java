package school.redrover.hw.hw10.additional;

import java.util.List;

public class Director extends Manager {

    public Director(String name, double dailySalary, int numOfSubordinates) {
        super(name, dailySalary, numOfSubordinates);
    }

    @Override
    public double getSalary(List<Month> months) {
        double baseSalary = calculateBaseSalary(months);
        return baseSalary * (1 + getNumOfSubordinates() * 0.03);
    }

    @Override
    public double getSalaryForMonth(Month month) {
        double baseSalary = calculateSalaryForMonth(month);
        return baseSalary * (1 + getNumOfSubordinates() * 0.03);
    }
}