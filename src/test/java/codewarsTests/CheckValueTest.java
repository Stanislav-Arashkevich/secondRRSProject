package codewarsTests;

import codewars.CheckValue;
import org.junit.Test;

import static org.testng.Assert.*;

public class CheckValueTest {

    @Test
    public void testSomething() {
        assertTrue(CheckValue.check(new Object[]{66, 101}, 66));
        assertTrue(CheckValue.check(new Object[]{80, 117, 115, 104, 45, 85, 112, 115}, 45));
        assertTrue(CheckValue.check(new Object[]{'t', 'e', 's', 't'}, 'e'));
        assertFalse(CheckValue.check(new Object[]{"what", "a", "great", "kata"}, "kat"));
    }
}
