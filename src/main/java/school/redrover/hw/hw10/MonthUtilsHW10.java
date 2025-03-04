package school.redrover.hw.hw10;

public class MonthUtilsHW10 {

    public static final MonthHW10[] MONTHS = {
            new MonthHW10("Jan", 31, 17),
            new MonthHW10("Feb", 28, 20),
            new MonthHW10("Mar", 31, 21),
            new MonthHW10("Apr", 30, 22),
            new MonthHW10("May", 31, 18),
            new MonthHW10("Jun", 30, 19),
            new MonthHW10("Jul", 31, 23),
            new MonthHW10("Aug", 31, 21),
            new MonthHW10("Sep", 30, 22),
            new MonthHW10("Oct", 31, 23),
            new MonthHW10("Nov", 30, 19),
            new MonthHW10("Dec", 31, 22)
    };

    public MonthHW10 getMonths(String name) {

        for (MonthHW10 month : MONTHS) {
            if (month.getNameOfMonth().equals(name)) {
                return month;
            }
        }

        return null;
    }
}