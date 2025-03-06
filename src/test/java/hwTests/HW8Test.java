package hwTests;

import org.junit.Test;
import school.redrover.hw.hw8.Employee;
import school.redrover.hw.hw8.Manager;
import school.redrover.hw.hw8.Month;
import school.redrover.hw.hw8.MonthUtils;

public class HW8Test {

    @Test
    public void testSalary() {

        MonthUtils month = new MonthUtils();

        String monthName = "Feb";

        Employee[] employee = {
                new Employee("Oleg", 31, "Male", 240),
                new Employee("Anna", 28, "Female", 180),
                new Employee("Victor", 35, "Male", 280),
        };

        for (Employee employee1 : employee) {

            System.out.printf("Monthly salary for %s for %s = %.2f%n", employee1.getEmpName(), monthName,
                    employee1.getSalaryForMonthName(new Month[]{month.getMonths(monthName)}, monthName));
        }

        Manager manager = new Manager("Peter", 36, "Male", 350, 3);

        System.out.printf("Monthly salary for %s for %s = %.2f%n", manager.getManagerName(), monthName,
                manager.getSalary(new Month[]{month.getMonths(monthName)}, monthName));

    }
}
