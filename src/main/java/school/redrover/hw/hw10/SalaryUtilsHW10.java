package school.redrover.hw.hw10;

public class SalaryUtilsHW10 {

    public double getTotalSalary(EmployeeHW10[] employees, MonthHW10[] MONTHS) {

        double total = 0;

        for (EmployeeHW10 employee : employees) {
            total += employee.getSalary(MONTHS);
        }

        return total;
    }

    public double getTotalSalary(EmployeeHW10[] employees) {
        return getTotalSalary(employees, MonthUtilsHW10.MONTHS);
    }

    public double getTotalSalaryForOneMonth(EmployeeList employees, String monthName){

        MonthUtilsHW10 month = new MonthUtilsHW10();

        double totalMonth = 0;

        for (EmployeeHW10 employee : employees.employees) {

//            System.out.printf("Monthly salary for %s for %s = %.2f%n", employee.getEmpName(), monthName,
//                    employee.getSalaryForOneMonth(new MonthHW10[]{month.getMonths(monthName)}, monthName));

            totalMonth += employee.getSalaryForOneMonth(new MonthHW10[]{month.getMonths(monthName)}, monthName);
        }

//        System.out.printf("Total salary for all employees for %s = %.2f%n", monthName, totalMonth);

        return totalMonth;
    }
}