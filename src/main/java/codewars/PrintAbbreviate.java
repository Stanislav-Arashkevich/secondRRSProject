package codewars;

/*
Напишите функцию, которая преобразует имя в инициалы. В этой задаче нужно ввести два слова с одним пробелом между ними.

Выходные данные должны состоять из двух заглавных букв с точкой, разделяющей их.

Это должно выглядеть примерно так:

Sam Harris => S.H

patrick feeney => P.F
 */

public class PrintAbbreviate {

    public static void main(String[] args) {

        String name = "Stanislav Aleksandrovich";

        System.out.println(abbrevName(name));
    }

    public static String abbrevName(String name) {

        return new StringBuilder()
                .append(name.charAt(0))
                .append(".")
                .append(name.charAt(name.indexOf(" ") + 1))
                .toString()
                .toUpperCase();

//        String[] arr = name.toUpperCase().split(" ");
//        return String.format("%s.%s", arr[0].charAt(0), arr[1].charAt(0));
    }
}
