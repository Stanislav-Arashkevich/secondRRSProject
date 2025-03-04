package school.redrover.hw.hw10;

public class MonthHW10 {

    private final String nameOfMonth;
    private final int dayQuantity;
    private final int workDays;

    public MonthHW10(String nameOfMonth, int dayQuantity, int workDays) {
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
