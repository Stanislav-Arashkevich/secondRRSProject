package school.redrover.hw.hw7;

public class HW7_2 {

    public static void main(String[] args) {

        System.out.println("---Tasks---");
        for (int i = 0; i < 10; i++) {
            for (int j = 10; i < j; j--) {
                System.out.print(10 - j + "  ");
            }

            System.out.println();
        }

        System.out.println("---Task2---");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("   ");
            }

            for (int j = 0; j < 10 - i; j++) {
                System.out.print(j + "  ");
            }

            System.out.println();
        }

        System.out.println("---Task3---");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }

            for (int j = 9 - i; j > 0; j--) {
                System.out.print(j + " ");
            }

            for (int j = 10; i < j; j--) {
                System.out.print(10 - j + " ");
            }

            System.out.println();
        }
    }
}
