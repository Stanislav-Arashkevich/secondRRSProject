package school.redrover.hw.hw12.p1;

public class MonthHW12 {

    private final String nameOfMonth;
    private final int dayQuantity;
    private final int workDays;

    public MonthHW12(String nameOfMonth, int dayQuantity, int workDays) {

        if (workDays > dayQuantity) {
            throw new IllegalArgumentException("Work days cannot exceed total days");
        }

        this.nameOfMonth = nameOfMonth;
        this.dayQuantity = dayQuantity;
        this.workDays = workDays;
    }

    public String getNameOfMonth() {
        return nameOfMonth;
    }

    public int getDayQuantity() {
        return dayQuantity;
    }

    public int getWorkDays() {
        return workDays;
    }
}