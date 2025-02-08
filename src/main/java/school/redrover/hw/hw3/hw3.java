package school.redrover.hw.hw3;

public class hw3 {

    public static void main(String[] args) {

        int a  = 524;
        int b = 27;

        //------Task1-------------
        if (a == b) {
            System.out.println("a == b");
        } else if (a > b) {
            System.out.println("a > b");
        } else {
            System.out.println("a < b");
        }

        //------Task2-------------
        if ((a + b) % 2 == 0) {
            System.out.println("maybe a and b are even");
        } else {
            System.out.println("some variable is odd");
        }

        //------Task3-------------
        if (a > 10) {
            System.out.println("a > 10");
            if (a < 100) {
                System.out.println("a < 100");
            }
        }

        if (a / 2.0 > 20) {
            System.out.println(true);
        }
        if (a >= 5 && a <= 40) {
            System.out.println(true);
        } else if (a < 5 || a > 40){
            System.out.println(false);
        }
    }
}