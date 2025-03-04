package school.redrover.hw.hw10.additional;

/**
 * @param dayQuantity  общее количество дней в месяце
 * @param workDays  рабочие дни в месяце */
public record Month(String name, int dayQuantity, int workDays) {

    @Override
    public String toString() {
        return name;
    }
}