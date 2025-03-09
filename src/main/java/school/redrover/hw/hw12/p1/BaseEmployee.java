package school.redrover.hw.hw12.p1;

public abstract class BaseEmployee {

    protected final String name;
    protected final int age;
    protected final String gender;
    protected final double dailySalary;

    protected BaseEmployee(String name, int age, String gender, double dailySalary) {

        if (name == null || dailySalary <= 0) {
            throw new IllegalArgumentException("Invalid employee data");
        }

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dailySalary = dailySalary;
    }

    protected BaseEmployee(String name, double dailySalary) {
        this(name, 0, "unknown", dailySalary);
    }

    protected abstract String getName();

    protected abstract int getAge();

    protected abstract String getGender();

    protected abstract double getDailySalary();

    protected double getSalary(MonthHW12[] months){
        return getBaseSalary(months);
    }

    protected double getBaseSalary(MonthHW12[] months) {

        double total = 0;

        for (MonthHW12 month : months) {
            total += getDailySalary() * month.getWorkDays();
        }

        return total;
    }

    protected double getSalaryForOneMonth(MonthHW12[] monthsArr, String monthName) {

        for (MonthHW12 month : monthsArr) {
            if (month.getNameOfMonth().equals(monthName)) {
                return getBaseSalary(new MonthHW12[]{month});
            }
        }

        System.out.println("No hands? No candy stands!");

        return 0;
    }
}


/*

protected double getBaseSalary(MonthHW12[] months) {

    return Arrays.stream(months)
            .mapToDouble(m -> getDailySalary() * m.getWorkDays())
            .sum();
}

 */