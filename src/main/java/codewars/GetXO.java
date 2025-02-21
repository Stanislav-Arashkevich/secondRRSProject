package codewars;

/*
    Проверьте, содержит ли строка одинаковое количество символов «x» и «o».
    Метод должен возвращать логическое значение и не учитывать регистр.
    Строка может содержать любые символы.

    Примеры ввода/вывода:

        XO("ooxx") => true
        XO("xooxx") => false
        XO("ooxXm") => true
        XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
        XO("zzoo") => false
 */
public class GetXO {

    public static void main(String[] args) {

    }

    public static boolean getXO(String str) {

        str = str.toLowerCase();

        int countX = 0;
        int countO = 0;

        for (char aChar : str.toCharArray()) {
            if (aChar == 'x') {
                countX++;
            } else if (aChar == 'o') {
                countO++;
            }
        }

        return countX == countO;

//        return str.replace("o","").length() == str.replace("x","").length();
    }
}