package school.redrover.hw.hw10;

public class EmployeeList {

    public final EmployeeHW10[] employees = {
            new EmployeeHW10("Oleg", 31, "Male", 240),
            new EmployeeHW10("Anna", 28, "Female", 180),
            new EmployeeHW10("Victor", 35, "Male", 280),
            new EmployeeHW10("Peter", 28, "Male", 200),
            new EmployeeHW10("Jane", 25, "Female", 250),
            new ManagerHW10("Anton", 320, 3),
            new ManagerHW10("Stan", 350, 2),
            new DirectorHW10("Vasiliy", 500, 2)
    };

    public EmployeeHW10 getEmployee(String name) {

        for (EmployeeHW10 emp : employees) {
            if (emp.getEmpName().equals(name)) {
                return emp;
            }
        }

        return null;
    }
}