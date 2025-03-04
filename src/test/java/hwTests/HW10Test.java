package hwTests;

import org.testng.annotations.Test;
import school.redrover.hw.hw10.*;

public class HW10Test {

    @Test
    public void testHW10() {

        String monthName = "Feb";

        MonthUtilsHW10 month = new MonthUtilsHW10();
        EmployeeList employeeList = new EmployeeList();
        EmployeeHW10[] employee = employeeList.employees;
        SalaryUtilsHW10 totals = new SalaryUtilsHW10();

        for (EmployeeHW10 emp : employee) {

            System.out.printf("Monthly salary for %s for %s = %.2f%n", emp.getEmpName(), monthName,
                    emp.getSalaryForOneMonth(new MonthHW10[]{month.getMonths(monthName)}, monthName));
        }

        System.out.printf("%nTotal for %s = %.2f%n", monthName, totals.getTotalSalaryForOneMonth(employeeList, monthName));

        System.out.printf("%nTotal for year = %.2f%n", totals.getTotalSalary(employee));
    }
}