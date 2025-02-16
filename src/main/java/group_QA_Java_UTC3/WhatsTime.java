package group_QA_Java_UTC3;

import java.util.Scanner;

/*
    Имеется s секунд.
    Вывести в консоль сколько в этом количестве:

    А) минут + секунд,
    В) часов + минут + секунд,
    С) дней + часов + минут + секунд,
    D) недель + дней + часов + минут + секунд.

    Пример:
        s = 124;
        2 min  4 sec
        0 hours  2 min  4 sec
        0 days  0 hours  2 min  4 sec
        0 weeks  0 days  0 hours  2 min  4 sec

    Расчеты:
        Минуты и секунды:   Количество минут вычисляется как целая часть от деления на 60,
                            а остаток от деления — это оставшиеся секунды.

        Часы и минуты:      Аналогично, количество часов рассчитывается от общего количества минут,
                            и оставшиеся минуты пересчитываются.

        Дни и часы: Количество дней рассчитывается от общего количества часов.

        Недели и дни: Количество недель рассчитывается от общего количества дней.
 */

public class WhatsTime {

    static final int SEC_PER_MIN = 60;
    static final int MIN_PER_HOUR = 60;
    static final int HOURS_PER_DAY = 24;
    static final int DAYS_PER_WEEK = 7;
    static final int WEEKS_PER_MONTH = 30;

    public static void main(String[] args) {

        System.out.print("Enter num of seconds: ");
        int totalSec = new Scanner(System.in).nextInt();

        printTime(totalSec);

    }

    static void printTime(int totalSec) {

        int currentSec = totalSec % SEC_PER_MIN;

        int min = totalSec / SEC_PER_MIN;
        int currentMin = min % MIN_PER_HOUR;

        int hours = min / MIN_PER_HOUR;
        int currentHours = hours % HOURS_PER_DAY;

        int days = hours / HOURS_PER_DAY;
        int currentDays = days % DAYS_PER_WEEK;

        int weeks = days / DAYS_PER_WEEK;
        int currentWeeks = weeks % WEEKS_PER_MONTH;

        System.out.printf("s = %d sec%n", totalSec);
        System.out.printf("%d min %d sec%n", min, currentSec);
        System.out.printf("%d hours %d min %d sec%n", hours, currentMin, currentSec);
        System.out.printf("%d days %d hours %d min %d sec%n", days, currentHours, currentMin, currentSec);
        System.out.printf("%d weeks %d days %d hours %d min %d sec%n", currentWeeks, currentDays, currentHours,
                                                                       currentMin, currentSec);
    }
}