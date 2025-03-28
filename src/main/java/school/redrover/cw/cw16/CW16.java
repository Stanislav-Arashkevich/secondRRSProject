package school.redrover.cw.cw16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CW16 {

    public static void main(String[] args) {


//        // ---List---
//        List<String> strings = new ArrayList<>();
//        System.out.println(strings);
//        strings.add("Hello");
//        System.out.println(strings);
//        strings.add("World");
//        System.out.println(strings);
//        strings.add("!");
//        System.out.println(strings);
//        strings.remove(1);
//        System.out.println();
//        strings.remove("!");
//
//        for (int i = 0; i < strings.size(); i++) {
//            String s = strings.get(i);
//            System.out.println(s);
//        }
//
//        List<Integer> ints = new ArrayList<>();
//        ints.add(1);
//        ints.add(2);
//        int elem = ints.get(1);
//        System.out.println(elem);
//
//        System.out.println(filterByPrefix(List.of("aa", "ab", "bc", "cd", "ad"), "a")); //[aa, ab, ad]
//
//        List<String> l1 = List.of("aa", "ab", "bc", "cd", "ad");
////        l1.add("xx"); т.к. такой лист immutable, то в него добавить еще что-то нельзя
//
//        List<String> l2 = new ArrayList<>(List.of("aa", "ab", "bc", "cd", "ad"));
//        l2.add("xx"); // а лист выше создается изменяемый - mutable.
//        System.out.println(l2);
//
//        List<String> l3 = new ArrayList<>();
//        l3.add("aa");
//        l3.add("ab");
//        l3.add("bc");
//        l3.add("cd");
//        l3.add("ad");
//        l3.add("aГ");
//        l3.add("xx");
//        System.out.println(l3);
//        l3.set(3, "dc");
//        System.out.println(l3);
//
//        List<List<Integer>> matrix = List.of(
//                List.of(1, 2, 3),
//                List.of(4, 5, 6),
//                List.of(7, 8, 9)
//        );
//        System.out.println(matrix);
//
//        Iterator<String> iter = l3.iterator();
//
//        while (iter.hasNext()) {
//            String s = iter.next();
//            System.out.println(s);
//        }


//        // ---Set---
//        // Данный интерфейс никак не гарантирует порядок элементов. Но 100% гарантирует их уникальность
//        Set<String> s1 = new HashSet<>(Set.of("aa", "ab", "bc", "cd", "ad"));
//        System.out.println(s1); // [aa, cd, bc, ab, ad]
//        s1.add("aa"); // дубль не добавится
//        System.out.println(s1); // [aa, cd, bc, ab, ad]
//
//        // Поскольку нет порядка в Set, то нельзя обращаться к элементу по индексу
//        // System.out.println(s1.get(0)); // так нельзя
//        // метод .add() возвращает boolean, если элемент добавлен - true, если уже был - false
//        System.out.println(s1.add("xx"));
//
//        for (String s : s1) {
//            System.out.println(s);
//        }

        /*
            +--------+-----------------+
            | Name   | Phone Number    |
            +--------+-----------------+
            | John   | 123-456-7890    |
            | Alice  | 098-765-4321    |
            | Bob    | 789-654-1230    |
            +--------+-----------------+
         */

        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("John", "123-456-7890");
        phoneBook.put("Alice", "098-765-4321");
        phoneBook.put("Bob", "789-654-1230");
        phoneBook.put("Bob", "456-987-1230"); // Значение ключа всегда уникально. Вторая запись перепишет первую.

        System.out.println(phoneBook.get("John"));
        System.out.println(phoneBook.get("Bruno"));
        System.out.println(phoneBook);

        System.out.println(phoneBook.size());

        //01:10:56
    }


    public static List<String> filterByPrefix(List<String> strings, String prefix) {

        List<String> result = new ArrayList<>();

        for (String s : strings) {
            if (s.startsWith(prefix)) {
                result.add(s);
            }
        }

        return result;
    }
}