package school.redrover.hw.hw8;

public class MonthUtils {

    Month[] months = {
            new Month("Jan", 31, 17),
            new Month("Feb", 28, 20),
            new Month("Mar", 31, 21),
            new Month("Apr", 30, 22),
            new Month("May", 31, 18),
            new Month("Jun", 30, 19),
            new Month("Jul", 31, 23),
            new Month("Aug", 31, 21),
            new Month("Sep", 30, 22),
            new Month("Oct", 31, 23),
            new Month("Nov", 30, 19),
            new Month("Dec", 31, 22)
    };

    public Month getMonths(String name) {

        for (Month month : months) {
            if (month.getNameOfMonth().equals(name)) {
                return month;
            }
        }

        return null;
    }
}
