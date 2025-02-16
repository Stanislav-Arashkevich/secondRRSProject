package codewarsTests;

import codewars.UpperCase;
import org.junit.Test;
import static org.testng.Assert.assertEquals;

public class UpperCaseTest {

    @Test
    public void testSomething() {
        assertEquals("HELLO","HELLO", UpperCase.MakeUpperCase("hello"));
    }
}
