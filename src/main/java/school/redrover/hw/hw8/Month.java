package school.redrover.hw.hw8;

/*
    Создать класс Month с полями: имя месяца, количеством дней и количеством рабочих дней.
    Создать класс MonthUtils, который бы хранил подготовленные месяцы или их массивы для
    использования (объекты класса Month).

 */
public class Month {

    private final String nameOfMonth;
    private final int dayQuantity;
    private final int workDays;

    public Month(String nameOfMonth, int dayQuantity, int workDays) {
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