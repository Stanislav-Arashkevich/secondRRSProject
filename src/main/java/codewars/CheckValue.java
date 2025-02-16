package codewars;

/*
    Вам будет предоставлен массив a и значение x. Всё, что вам нужно сделать, — это проверить,
    содержит ли предоставленный массив это значение.

    a может содержать числа или строки. x может быть любым.

    Возвращает, true если массив содержит значение, false если нет.
 */
public class CheckValue {

    public static boolean check(Object[] arr, Object x) {

        for (Object o : arr) {

            if (o.equals(x)){
                return true;
            }
        }

        return false;
    }
}


/*
return Arrays.stream(a).anyMatch(i -> x.equals(i));
 */