package school.redrover.cw.cw16;

import java.util.*;

public class CW16 {

    public static void main(String[] args) {

        // List, Set, Map - это интерфейсы (можно считать их абстрактными классами, но важно помнить, что нельзя
        // создать инстанс абстрактного класса (или в нашем случае инстанс интерфейса), т.к. он не имплементирован.)

        // ---List---
        List<String> strings = new ArrayList<>();
        System.out.println(strings);
        strings.add("Hello");
        System.out.println(strings);
        strings.add("World");
        System.out.println(strings);
        strings.add("!");
        System.out.println(strings);
        strings.remove(1);
        System.out.println();
        strings.remove("!");

        for (int i = 0; i < strings.size(); i++) {
            String s = strings.get(i);
            System.out.println(s);
        }

        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        int elem = ints.get(1);
        System.out.println(elem);

        System.out.println(filterByPrefix(List.of("aa", "ab", "bc", "cd", "ad"), "a")); //[aa, ab, ad]

        List<String> l1 = List.of("aa", "ab", "bc", "cd", "ad");
//        l1.add("xx"); т.к. такой лист immutable, то в него добавить еще что-то нельзя

        List<String> l2 = new ArrayList<>(List.of("aa", "ab", "bc", "cd", "ad"));
        l2.add("xx"); // а лист выше создается изменяемый - mutable.
        System.out.println(l2);

        List<String> l3 = new ArrayList<>();
        l3.add("aa");
        l3.add("ab");
        l3.add("bc");
        l3.add("cd");
        l3.add("ad");
        l3.add("aГ");
        l3.add("xx");
        System.out.println(l3);
        l3.set(3, "dc");
        System.out.println(l3);
        l3.clear();
        System.out.println(l3);

        List<List<Integer>> matrix = List.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6),
                List.of(7, 8, 9)
        );
        System.out.println(matrix);

        Iterator<String> iter = l3.iterator(); // Многие библиотеки, по причине того, как они написаны, вместо списков
                                               // возвращают итератор.

        while (iter.hasNext()) {
            String s = iter.next();
            System.out.println(s);
        }


        // ---Set---
        // Данный интерфейс никак не гарантирует порядок элементов. Но 100% гарантирует их уникальность
        Set<String> s1 = new HashSet<>(Set.of("aa", "ab", "bc", "cd", "ad"));
        System.out.println(s1); // [aa, cd, bc, ab, ad]
        s1.add("aa"); // дубль не добавится
        System.out.println(s1); // [aa, cd, bc, ab, ad]

        // Поскольку нет порядка в Set, то нельзя обращаться к элементу по индексу
        // System.out.println(s1.get(0)); // так нельзя
        // метод .add() возвращает boolean, если элемент добавлен - true, если уже был - false
        System.out.println(s1.add("xx"));

        for (String s : s1) {
            System.out.println(s);
        }


        // ---Map---
        // Map принимает два типа.

        // В Map мы работаем с двумя разными типами данных, при этом у них не одинаковая роль. Первый тип - это тип
        // данных ключа, второй - тип данных значения.

        // Допустим - есть некий список сотрудников. У каждого есть личный номер, а номеру соответствует имя, пол, ЗП,
        // адрес. В качестве ключа номер, в качестве значения - объект класса Employee.

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

        System.out.println(phoneBook.get("John")); // Вернуть Джона - вернется номер Джона
        System.out.println(phoneBook.get("Bruno")); // Вернуть Бруно - вернется null, т.к. Бруно нет в телефонной книге
        System.out.println(phoneBook);

        System.out.println(phoneBook.size());

        String s = "1-290874039ruihjffffffffepoi1u2asdf-98`1ur-12346fokem`09kc0][sadfm[a";

        Map<Character, Integer> res = new HashMap<>();
        for(char ch : s.toCharArray()) {
            int count;
            if (res.get(ch) == null) {
                //если в res еще не записывался такой символ, то пропуская else записываем в res этот символ ch с count
                count = 1;
            } else {
                //если в res такой символ уже есть, то берем его значение count и плюсуем к нему 1 и кладем опять в res
                count = res.get(ch) + 1;
            }
            res.put(ch, count);
        }

        System.out.println(res);

        // Второй способ (лаконичный)
        Map<Character, Integer> res2 = new HashMap<>();
        for (char ch : s.toCharArray()) {
            //.getOrDefault - возвращает значение для ключа ch, друг метода .get(ch), который возвращает соответствующее значение
            // .get(ch) если значения нет, то вернет null
            // .getOrDefault(ch, 0) - если значение ch==null, то вернет 0(ноль) - т.е. заданное по дефолту
            int count = res2.getOrDefault(ch, 0) + 1;
            res2.put(ch, count);
        }
        System.out.println(res2);
        System.out.println(res2.keySet()); // Выводим все ключи
        System.out.println(res2.values()); // Выводим все значения

        //Получаем set всех записей
        for (Map.Entry<Character, Integer> entry : res2.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // или
        for (Character key : res2.keySet()) {
            System.out.println("Key: " + key + ", Value: " + res2.get(key));
        }

        // ---Queue---
        // Работает по правилу FIFO
        Queue<String> queue = new LinkedList<>();
        queue.add("a"); // добавляет в конец очереди.
        System.out.println(queue);
        queue.add("b");
        System.out.println(queue);
        queue.add("c");
        System.out.println(queue);
        queue.add("d");
        System.out.println(queue);
        queue.add("e");
        System.out.println(queue);
        //----
        System.out.println("//-----//");
        //----
        System.out.println(queue.poll()); //
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue);
        System.out.println(queue.remove()); // удаляет первый, с головы
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);

        // ---Deque---
        // Работает по правилу LIFO
        Deque<String> deque = new LinkedList<>();
        deque.addFirst("a");
        System.out.println(deque);
        deque.addFirst("b"); //накидывает в начало
        System.out.println(deque);
        deque.addFirst("c");
        System.out.println(deque);
        deque.addFirst("d");
        System.out.println(deque);
        deque.addFirst("e");
        System.out.println(deque);
        deque.addLast("f");
        System.out.println(deque);
        deque.addLast("g");
        System.out.println(deque);
        //----
        System.out.println("//-----//");
        //----
        System.out.println(deque.pollFirst()); // забирает с головы
        System.out.println(deque);
        System.out.println(deque.pollFirst());
        System.out.println(deque);
        System.out.println(deque.peekFirst()); // показать первый
        System.out.println(deque);
        //----
        System.out.println("//-----//");
        //----
        System.out.println(deque.pollLast()); // забирает с хвоста
        System.out.println(deque);
        System.out.println(deque.pollLast());
        System.out.println(deque);


        // ---Stack---
        // Работает по правилу LIFO
        Stack<String> stack = new Stack<>();
        stack.push("a"); // положить
        System.out.println(stack);
        stack.push("b");
        System.out.println(stack);
        stack.push("c");
        System.out.println(stack);
        stack.push("d");
        System.out.println(stack);
        //---
        System.out.println("//-----//");
        //---
        System.out.println(stack.pop()); // достать
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.peek()); //показать последний
        System.out.println(stack);
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