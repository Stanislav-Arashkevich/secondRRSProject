package codewars;

/*
    Иногда мне нужно быстро перевести мили на галлон (mpg) в километры на литр (kpl).

    Создайте приложение, которое будет отображать количество километров на литр (результат)
    в зависимости от количества миль на галлон (ввод).

    Обязательно округлите результат до двух знаков после запятой.

    Некоторые полезные ассоциации, относящиеся к этому ката:

    1 Imperial Gallon  = 4,54609188 литра
    1 Mile  = 1,609344 километра

 */

public class Converter {

    public static double mpgToKPM(int mpg) {

        final double LITER_PER_KM = 4.54609188 / 1.609344;

        return Math.round(mpg / LITER_PER_KM * 100) / 100.;
    }

    public static void main(String[] args) {

        System.out.println(mpgToKPM(10));
    }
}

//    static final double LITER_PER_GAL = 4.54609188; //litres
//    static final double KM_PER_MILE = 1.609344; //km;

//        double litresPer100km = ((100. / mpg * LITER_PER_GAL) / (100 * KM_PER_MILE) * 100);
//        return Math.round((100. / litresPer100km) * 100.0) / 100.0;

//        return BigDecimal.valueOf(mpg / LITER_PER_KM)
//                .setScale(2, RoundingMode.HALF_UP)
//                .doubleValue();