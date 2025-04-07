package school.redrover.cw.cw16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Company {

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Ivan", "Atlanta"),
                new Employee("Peter", "Boston"),
                new Employee("John", "SF"),
                new Employee("James", "Boston"),
                new Employee("Paul", "SF")
        );

        //Ключ - это строка, а значение - это список объектов типа Employee
        Map<String, List<Employee>> office =  new HashMap<>();
        for (Employee employee : employees) {
            //.getOrDefault - возвращает значение для ключа employee.office, друг метода .get(employee.office), который возвращает соответствующее значение
            // .get(employee.office) если значения нет, то вернет null
            // .getOrDefault(employee.office, new ArrayList<>()) - если значение(список) employee.office==null, то вернет new ArrayList<>() - т.е. заданное по дефолту (новый ArrayList)
            List<Employee> inOffice = office.getOrDefault(employee.office, new ArrayList<>());
            inOffice.add(employee);
            office.put(employee.office, inOffice);
        }

        System.out.println(office);
    }
}

class Employee {

    final String name;
    final String office;

    Employee(String name, String office) {
        this.name = name;
        this.office = office;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}