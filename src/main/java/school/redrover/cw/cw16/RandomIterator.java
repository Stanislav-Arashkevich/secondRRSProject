package school.redrover.cw.cw16;

import java.util.Iterator;
import java.util.Random;

public class RandomIterator implements Iterator<Integer> {

    private Random random = new Random();

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        return random.nextInt();
    }

    public static void main(String[] args) {
        Iterator<Integer> iter = new RandomIterator();

        System.out.println(iter.next());
        System.out.println(iter.next());
        System.out.println(iter.next());
        System.out.println(iter.next());
    }
}
