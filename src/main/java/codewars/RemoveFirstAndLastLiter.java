package codewars;

public class RemoveFirstAndLastLiter {

    public static String remove(String str) {

        StringBuilder sb = new StringBuilder(str);

        sb.deleteCharAt(0);
        sb.deleteCharAt(sb.length() - 1);

        return sb.toString();

//        for (int i = 1; i < str.length() - 1; i++) {
//            sb.append(str.charAt(i));
//        }

//        return str.substring(1, str.length() - 1);
    }

    public static void main(String[] args) {

        System.out.println(remove("person"));
    }
}
