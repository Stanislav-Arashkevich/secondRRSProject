package school.redrover.hw.hw12.p1;

public class EmployeeListHW12 {

    public final BaseEmployee[] employees = {
            new EmployeeHW12("Oleg", 31, "Male", 240),
            new EmployeeHW12("Anna", 28, "Female", 180),
            new EmployeeHW12("Victor", 35, "Male", 280),
            new EmployeeHW12("Peter", 28, "Male", 200),
            new EmployeeHW12("Jane", 25, "Female", 250),
            new ManagerHW12("Anton", 320, 3),
            new ManagerHW12("Stan", 350, 2),
            new DirectorHW12("Vasiliy", 500, 2)
    };

    public BaseEmployee getBaseEmployee(String name) {

        for (BaseEmployee emp : employees) {
            if (emp.getName().equals(name)) {
                return emp;
            }
        }

        return null;
    }
}