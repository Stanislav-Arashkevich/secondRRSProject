package codewars;

public class HowMuchILoveYou {

    public static String howMuchILoveYou(int nb) {

        return switch (nb) {
            case 1 -> "I love you";
            case 2 -> "a little";
            case 3 -> "a lot";
            case 4 -> "passionately";
            case 5 -> "madly";
            case 6 -> "not at all";
            default -> howMuchILoveYou(nb - 6);
        };
    }

    public static void main(String[] args) {

        System.out.println(howMuchILoveYou(1));
        System.out.println(howMuchILoveYou(2));
        System.out.println(howMuchILoveYou(3));
        System.out.println(howMuchILoveYou(4));
        System.out.println(howMuchILoveYou(5));
        System.out.println(howMuchILoveYou(6));
        System.out.println(howMuchILoveYou(7));
        System.out.println(howMuchILoveYou(8));
        System.out.println(howMuchILoveYou(54));
        System.out.println();
        System.out.println(howMuchILoveYou(524));
    }
}