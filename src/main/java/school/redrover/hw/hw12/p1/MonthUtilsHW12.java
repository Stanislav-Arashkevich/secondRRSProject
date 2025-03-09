package school.redrover.hw.hw12.p1;

import java.util.Arrays;

public class MonthUtilsHW12 {

    public static final MonthHW12[] MONTHS = {
            new MonthHW12("Jan", 31, 17),
            new MonthHW12("Feb", 28, 20),
            new MonthHW12("Mar", 31, 21),
            new MonthHW12("Apr", 30, 22),
            new MonthHW12("May", 31, 18),
            new MonthHW12("Jun", 30, 19),
            new MonthHW12("Jul", 31, 23),
            new MonthHW12("Aug", 31, 21),
            new MonthHW12("Sep", 30, 22),
            new MonthHW12("Oct", 31, 23),
            new MonthHW12("Nov", 30, 19),
            new MonthHW12("Dec", 31, 22)
    };

    public static MonthHW12[] getQuarter(int quarter) {
        return switch (quarter) {
            case 1 -> Arrays.copyOfRange(MONTHS, 0, 3);
            case 2 -> Arrays.copyOfRange(MONTHS, 3, 6);
            case 3 -> Arrays.copyOfRange(MONTHS, 6, 9);
            case 4 -> Arrays.copyOfRange(MONTHS, 9, 12);
            default -> throw new IllegalArgumentException("Invalid quarter");
        };
    }

    public static MonthHW12[] getHalf(int half) {
        return switch (half) {
            case 1 -> Arrays.copyOfRange(MONTHS, 0, 6);
            case 2 -> Arrays.copyOfRange(MONTHS, 6, 12);
            default -> throw new IllegalArgumentException("Invalid half");
        };
    }

    public MonthHW12 getMonths(String name) {

        for (MonthHW12 month : MONTHS) {
            if (month.getNameOfMonth().equals(name)) {
                return month;
            }
        }

        return null;
    }
}
//    public static final MonthHW12[] Q1 = {MONTHS[0], MONTHS[1], MONTHS[2]};
//    public static final MonthHW12[] Q2 = {MONTHS[3], MONTHS[4], MONTHS[5]};
//    public static final MonthHW12[] Q3 = {MONTHS[6], MONTHS[7], MONTHS[8]};

//    public static final MonthHW12[] Q4 = {MONTHS[9], MONTHS[10], MONTHS[11]};
//    public static final MonthHW12[] H1 = {MONTHS[0], MONTHS[1], MONTHS[2], MONTHS[3], MONTHS[4], MONTHS[5]};

//    public static final MonthHW12[] H2 = {MONTHS[6], MONTHS[7], MONTHS[8], MONTHS[9], MONTHS[10], MONTHS[11]};
//}