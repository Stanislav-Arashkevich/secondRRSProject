package school.redrover.hw.hw12.p1;

public class SalaryUtilsHW12 {

    public double getTotalSalary(BaseEmployee[] employees, MonthHW12[] MONTHS) {

        double total = 0;

        for (BaseEmployee employee : employees) {
            total += employee.getSalary(MONTHS);
        }

        return total;
    }

    public double getTotalSalary(EmployeeHW12[] employees) {
        return getTotalSalary(employees, MonthUtilsHW12.MONTHS);
    }

    public double getTotalSalaryForOneMonth(EmployeeListHW12 employees, String monthName){

        MonthUtilsHW12 month = new MonthUtilsHW12();

        double totalMonth = 0;

        for (BaseEmployee employee : employees.employees) {

//            System.out.printf("Monthly salary for %s for %s = %.2f%n", employee.getEmpName(), monthName,
//                    employee.getSalaryForOneMonth(new MonthHW10[]{month.getMonths(monthName)}, monthName));

            totalMonth += employee.getSalaryForOneMonth(new MonthHW12[]{month.getMonths(monthName)}, monthName);
        }

//        System.out.printf("Total salary for all employees for %s = %.2f%n", monthName, totalMonth);

        return totalMonth;
    }
}