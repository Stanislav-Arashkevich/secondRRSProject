package hwTests;

import org.testng.annotations.Test;
import school.redrover.hw.hw12.p1.*;

import static org.testng.Assert.*;

public class HW12Test {

    // Тестовые данные
    private final MonthHW12[] testMonths = MonthUtilsHW12.getQuarter(1); // Январь, Февраль, Март
    private final MonthHW12[] fullYear = MonthUtilsHW12.MONTHS;

    // ============================================
    // Тесты для MonthHW12
    // ============================================
    @Test
    public void testMonthCreation() {

        MonthHW12 jan = new MonthHW12("Jan", 31, 17);

        assertEquals(jan.getNameOfMonth(), "Jan");
        assertEquals(jan.getDayQuantity(), 31);
        assertEquals(jan.getWorkDays(), 17);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testInvalidMonth() {
        new MonthHW12("BadMonth", 30, 31); // Рабочих дней больше, чем дней в месяце
    }

    // ============================================
    // Тесты для MonthUtilsHW12
    // ============================================
    @Test
    public void testQuarters() {

        assertEquals(MonthUtilsHW12.getQuarter(1).length, 3);
        assertEquals(MonthUtilsHW12.getHalf(1).length, 6);
    }

    @Test
    public void testFindMonth() {

        MonthHW12 feb = new MonthUtilsHW12().getMonths("Feb");

        assertNotNull(feb);
        assertEquals(feb.getWorkDays(), 20);
    }

    // ============================================
    // Тесты для EmployeeHW12
    // ============================================
    @Test
    public void testEmployeeSalary() {

        EmployeeHW12 emp = new EmployeeHW12("John", 100.0);

        double expected = 100 * (17 + 20 + 21); // За первый квартал

        assertEquals(emp.getSalary(testMonths), expected, 0.01);
    }

    @Test
    public void testConvertToManager() {

        EmployeeHW12 emp = new EmployeeHW12("Alice", 200.0);
        ManagerHW12 manager = emp.convertToManager(5);

        assertEquals(manager.getName(), "Alice");
        assertEquals(manager.getDailySalary(), 200.0, 0.01);
        assertEquals(manager.getSubordinates(), 5);
    }

    // ============================================
    // Тесты для ManagerHW12
    // ============================================
    @Test
    public void testManagerSalary() {

        ManagerHW12 manager = new ManagerHW12("Bob", 150.0, 10);

        double baseSalary = 150 * (17 + 20 + 21);
        double expected = baseSalary * 1.10; // 10 подчиненных * 1%

        assertEquals(manager.getSalary(testMonths), expected, 0.01);
    }

    // ============================================
    // Тесты для DirectorHW12
    // ============================================
    @Test
    public void testDirectorSalary() {

        DirectorHW12 director = new DirectorHW12("Eve", 300.0, 5);

        double baseSalary = 300 * (17 + 20 + 21);
        double expected = baseSalary * 1.15; // 5 подчиненных * 3%

        assertEquals(director.getSalary(testMonths), expected, 0.01);
    }

    // ============================================
    // Тесты для SalaryUtilsHW12
    // ============================================
    @Test
    public void testTotalSalary() {

        BaseEmployee[] team = {
                new EmployeeHW12("John", 100.0),
                new ManagerHW12("Alice", 150.0, 5),
                new DirectorHW12("Bob", 200.0, 10)
        };

        SalaryUtilsHW12 utils = new SalaryUtilsHW12();

        double total = utils.getTotalSalary(team, testMonths);
        double expected =
                100 * 58 +          // Сотрудник
                150 * 58 * 1.05 +   // Менеджер (5 подчиненных)
                200 * 58 * 1.30;    // Директор (10 подчиненных)

        assertEquals(total, expected, 0.01);
    }

    // ============================================
    // Тесты для EmployeeListHW12
    // ============================================
    @Test
    public void testEmployeeSearch() {

        EmployeeListHW12 list = new EmployeeListHW12();

        assertNotNull(list.getBaseEmployee("Oleg"));
        assertNull(list.getBaseEmployee("NonExistent"));
    }
}