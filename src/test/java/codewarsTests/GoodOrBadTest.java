package codewarsTests;

import codewars.GoodOrBad;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GoodOrBadTest {

    @Test
    public void basicTests() {
        assertEquals("Fail!", GoodOrBad.well(new String[] {"bad", "bad", "bad"}));
        assertEquals("Publish!", GoodOrBad.well(new String[] {"good", "bad", "bad", "bad", "bad"}));
        assertEquals("I smell a series!", GoodOrBad.well(new String[] {
                "good", "bad", "bad", "bad", "bad", "good", "bad", "bad", "good"}));
    }
}