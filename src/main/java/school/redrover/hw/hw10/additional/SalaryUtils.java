package school.redrover.hw.hw10.additional;

import java.util.List;

public class SalaryUtils {

    public static double getTotalSalary(List<Employee> employees, List<Month> months) {

        return employees.stream()
                .mapToDouble(emp -> emp.getSalary(months))
                .sum();
    }

    public static double getTotalSalaryForMonth(List<Employee> employees, Month month) {

        return employees.stream()
                .mapToDouble(emp -> emp.getSalaryForMonth(month))
                .sum();
    }
}