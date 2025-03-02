package school.redrover.hw.hw9;

public class MonthUtilsHW9 {

    MonthHW9[] months = {
            new MonthHW9("Jan", 31, 17),
            new MonthHW9("Feb", 28, 20),
            new MonthHW9("Mar", 31, 21),
            new MonthHW9("Apr", 30, 22),
            new MonthHW9("May", 31, 18),
            new MonthHW9("Jun", 30, 19),
            new MonthHW9("Jul", 31, 23),
            new MonthHW9("Aug", 31, 21),
            new MonthHW9("Sep", 30, 22),
            new MonthHW9("Oct", 31, 23),
            new MonthHW9("Nov", 30, 19),
            new MonthHW9("Dec", 31, 22)
    };

    public MonthHW9 getMonths(String name) {

        for (MonthHW9 month : months) {
            if (month.getNameOfMonth().equals(name)) {
                return month;
            }
        }

        return null;
    }
}
