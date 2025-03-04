package school.redrover.hw.hw10.additional;

import java.util.List;

public class EmployeeRepository {
    private final List<Employee> employees = List.of(
            new Employee("Oleg", 31, "Male", 240),
            new Employee("Anna", 28, "Female", 180),
            new Employee("Victor", 35, "Male", 280),
            new Employee("Peter", 28, "Male", 200),
            new Employee("Jane", 25, "Female", 250),
            new Manager("Anton", 320, 3),
            new Manager("Stan", 350, 2),
            new Director("Vasiliy", 500, 2)
    );

    public List<Employee> getEmployees() {
        return employees;
    }

    public Employee getEmployeeByName(String name) {

        return employees.stream()
                .filter(emp -> emp.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }
}