package codewars;

public class BobBus {

    public static int enough(int cap, int on, int wait){

//        Math.max(0, wait + on - cap);
        return cap >= on + wait ? 0 : (on + wait) - cap;
    }

    public static void main(String[] args) {

        System.out.println(enough(10, 5, 5));
        System.out.println(enough(100, 60, 50));
        System.out.println(enough(20, 5, 5));
    }
}
