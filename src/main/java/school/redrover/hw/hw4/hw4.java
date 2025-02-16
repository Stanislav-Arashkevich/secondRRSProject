package school.redrover.hw.hw4;

public class hw4 {

    public static void main(String[] args) {

        //------Task1-------------
        for (int i = 0; i < 15; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        //------Task2-------------
        for (int i = 1; i < 10000; i *= 5) {

            if (i == 1) {
                continue;
            }

            System.out.print(i + " ");
        }
        System.out.println();

        //------Task3-------------
        //v1
        for (int i = 40; i <= 60; i += 4) {
            System.out.print(i + " ");
        }
        System.out.println();

        //v2
        for (int i = 40; i <= 60; i++) {
            if (i % 4 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
