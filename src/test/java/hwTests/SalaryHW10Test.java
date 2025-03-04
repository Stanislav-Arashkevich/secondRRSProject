package hwTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import school.redrover.hw.hw10.additional.*;

import java.util.List;

public class SalaryHW10Test {

    @Test(description = "Проверка базовой зарплаты сотрудника за месяц")
    public void testEmployeeSalaryForMonth() {

        double dailySalary = 240.0;

        Employee employee = new Employee("Oleg", 31, "Male", dailySalary);
        Month feb = MonthUtils.getMonth("Feb");

        Assert.assertNotNull(feb, "Месяц Feb должен быть найден");

        double expectedSalary = dailySalary * feb.workDays(); // 240 * 20 = 4800
        double actualSalary = employee.getSalaryForMonth(feb);

        Assert.assertEquals(actualSalary, expectedSalary, 0.001,
                "Зарплата сотрудника не соответствует расчету");
    }

    @Test(description = "Проверка годовой зарплаты сотрудника")
    public void testEmployeeSalaryForYear() {

        double dailySalary = 180.0;

        Employee employee = new Employee("Anna", 28, "Female", dailySalary);

        List<Month> months = MonthUtils.MONTHS;

        double expectedSum = months.stream()
                .mapToDouble(m -> dailySalary * m.workDays())
                .sum();

        double actualSum = employee.getSalary(months);

        Assert.assertEquals(actualSum, expectedSum, 0.001,
                "Годовая зарплата сотрудника не соответствует расчету");
    }

    @Test(description = "Проверка зарплаты менеджера за месяц")
    public void testManagerSalaryForMonth() {

        double dailySalary = 320.0;
        int subordinates = 3;

        Manager manager = new Manager("Anton", dailySalary, subordinates);
        Month feb = MonthUtils.getMonth("Feb");

        Assert.assertNotNull(feb, "Месяц Feb должен быть найден");

        double base = dailySalary * feb.workDays(); // 320 * 20 = 6400
        double expectedSalary = base * (1 + subordinates * 0.01); // 6400 * 1.03 = 6592
        double actualSalary = manager.getSalaryForMonth(feb);

        Assert.assertEquals(actualSalary, expectedSalary, 0.001,
                "Зарплата менеджера за месяц некорректна");
    }

    @Test(description = "Проверка зарплаты директора за месяц (без суммирования менеджерской надбавки)")
    public void testDirectorSalaryForMonth() {

        double dailySalary = 500.0;
        int subordinates = 2;

        Director director = new Director("Vasiliy", dailySalary, subordinates);
        Month feb = MonthUtils.getMonth("Feb");

        Assert.assertNotNull(feb, "Месяц Feb должен быть найден");

        double base = dailySalary * feb.workDays(); // 500 * 20 = 10000
        double expectedSalary = base * (1 + subordinates * 0.03); // 10000 * 1.06 = 10600
        double actualSalary = director.getSalaryForMonth(feb);

        Assert.assertEquals(actualSalary, expectedSalary, 0.001, "Зарплата директора за месяц некорректна");
    }

    @Test(description = "Проверка общей годовой зарплаты через SalaryUtils")
    public void testTotalSalaryYear() {

        EmployeeRepository repository = new EmployeeRepository();
        List<Employee> employees = repository.getEmployees();
        List<Month> months = MonthUtils.MONTHS;

        double expectedTotal = employees.stream()
                .mapToDouble(emp -> emp.getSalary(months))
                .sum();

        double actualTotal = SalaryUtils.getTotalSalary(employees, months);

        Assert.assertEquals(actualTotal, expectedTotal, 0.001, "Общая годовая зарплата некорректна");
    }

    @Test(description = "Проверка суммарной зарплаты за месяц через SalaryUtils")
    public void testTotalSalaryForMonth() {

        EmployeeRepository repository = new EmployeeRepository();
        List<Employee> employees = repository.getEmployees();
        Month feb = MonthUtils.getMonth("Feb");

        Assert.assertNotNull(feb, "Месяц Feb должен быть найден");

        double expectedTotal = employees.stream()
                .mapToDouble(emp -> emp.getSalaryForMonth(feb))
                .sum();
        double actualTotal = SalaryUtils.getTotalSalaryForMonth(employees, feb);

        Assert.assertEquals(actualTotal, expectedTotal, 0.001, "Общая зарплата за месяц некорректна");
    }

    @Test(description = "Проверка поиска сотрудника по имени")
    public void testFindEmployeeByName() {

        EmployeeRepository repository = new EmployeeRepository();
        Employee emp = repository.getEmployeeByName("Anna");

        Assert.assertNotNull(emp, "Сотрудник Anna должен быть найден");
        Assert.assertEquals(emp.getName(), "Anna", "Найденный сотрудник должен иметь имя Anna");
    }

    @Test(description = "Проверка, что при отсутствии месяца возвращается null")
    public void testGetMonthNotFound() {

        Month nonExistent = MonthUtils.getMonth("NonExistentMonth");

        Assert.assertNull(nonExistent, "При отсутствии месяца должен возвращаться null");
    }
}