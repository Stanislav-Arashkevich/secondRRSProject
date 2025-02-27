package codewars;

/*
    Филипу только что исполнилось четыре года, и он хочет знать, сколько ему будет лет в разные годы в будущем,
    например, в 2090 или 3044. Его родители не могут постоянно считать, поэтому они попросили вас помочь им,
    написав программу, которая сможет отвечать на бесконечные вопросы Филипа.

    Ваша задача — написать функцию, которая принимает два параметра: год рождения и год, по отношению к которому
    нужно посчитать количество лет. Поскольку Филипп с каждым днём становится всё более любопытным, он может скоро
    захотеть узнать, сколько лет прошло до его рождения, поэтому ваша функция должна работать как с датами в будущем,
    так и с датами в прошлом.

    Выведите результат в следующем формате: для дат в будущем: «Вам ... лет(а)».
    Для дат в прошлом: «Вы родитесь в ... год(ы)».
    Если год рождения совпадает с запрашиваемым годом, верните: «Вы родились в этом году!»

    «...» заменяется на число, за которым следует один пробел. Имейте в виду, что вам нужно учитывать как «год»,
    так и «годы», в зависимости от результата.
 */

public class AgeDiff {

    public static String CalculateAge(int birth, int yearTo) {

        int ageDifference = Math.abs(yearTo - birth);
        String ageUnit = ageDifference > 1 ? "years" : "year";

        if (birth < yearTo) {
            return String.format("You are %d %s old.", ageDifference, ageUnit);
        } else if (birth > yearTo) {
            return String.format("You will be born in %d %s.", ageDifference, ageUnit);
        } else {
            return "You were born this very year!";
        }
    }
}













/*
    int ageDifference = Math.abs(yearTo - birth);
    String ageUnit = ageDifference > 1 ? "years" : "year";
    String tense = birth < yearTo ? "are" : "will be born in";

    if (birth == yearTo) {
        return "You were born this very year!";
    }

    return String.format("You %s %d %s.", tense, ageDifference, ageUnit);
 */









/*
        int philYears;

        if (birth < yearTo) {
            philYears = yearTo - birth;
            if (philYears > 2) {
                return String.format("You are %d years old.", philYears);
            } else {
                return String.format("You are %d year old.", philYears);
            }
        } else if (birth > yearTo) {
            philYears = birth - yearTo;
            if (philYears > 2) {
                return String.format("You will be born in %d years.", philYears);
            } else if (philYears == 1){
                return String.format("You will be born in %d year.", philYears);
            }else {
                return String.format("You are %d year old.", philYears);
            }
        } else {
            return "You were born this very year!";
        }
 */