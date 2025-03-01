package codewars;

public class CheckLitter {

    public static boolean check(Object[] a, Object x) {

        for (Object o : a) {
            if (o.equals(x)) {
                return true;
            }
        }

        return false;
//        return Arrays.asList(a).contains(x);
    }
}
