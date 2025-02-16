package codewars;

/*
Создайте метод, который отвечает на вопрос «Вы играете на банджо?».
Если ваше имя начинается на букву «Р» или строчную «р», вы играете на банджо!

Функция принимает имя в качестве единственного аргумента и возвращает одну из следующих строк:

    name + " plays banjo"
    name + " does not play banjo"
Приведенные имена всегда являются допустимыми строками.
 */

public class Banjo {

    public static String areYouPlayingBanjo(String name) {

        if (name.startsWith("r") || name.startsWith("R")) {
            return name + " plays banjo";
        } else {
            return name + " does not play banjo";
        }
    }

    public static void main(String[] args) {
        String actual = "Martin";

        System.out.println(areYouPlayingBanjo(actual));
    }
}