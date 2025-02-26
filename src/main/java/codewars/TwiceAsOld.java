package codewars;


/*
    Вычислите, сколько лет назад отец был в два раза старше своего сына (или через сколько лет он
    будет в два раза старше). Ответ всегда больше или равен 0, независимо от того,
    было ли это в прошлом или будет в будущем.
 */

public class TwiceAsOld {

    public static int twiceAsOld(int dadYears, int sonYears) {

        return Math.abs(dadYears - (sonYears + sonYears));
    }
}
