package school.redrover.hw.hw10.additional;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MonthUtils {
    public static final List<Month> MONTHS = List.of(
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
    );

    private static final Map<String, Month> MONTH_MAP = MONTHS.stream()
            .collect(Collectors.toUnmodifiableMap(Month::name, m -> m));

    public static Month getMonth(String name) {
        return MONTH_MAP.get(name);
    }
}