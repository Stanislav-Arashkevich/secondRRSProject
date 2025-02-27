package codewarsTests;

import codewars.AgeDiff;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AgeDiffTest {

    @Test
    public void testAge() {

        assertEquals(AgeDiff.CalculateAge(2012, 2016), "You are 4 years old.");
        assertEquals(AgeDiff.CalculateAge(1989, 2016), "You are 27 years old.");
        assertEquals(AgeDiff.CalculateAge(2000, 2090), "You are 90 years old.");
        assertEquals(AgeDiff.CalculateAge(2000, 1990), "You will be born in 10 years.");
        assertEquals(AgeDiff.CalculateAge(3400, 3400), "You were born this very year!");
        assertEquals(AgeDiff.CalculateAge(900, 2900), "You are 2000 years old.");
        assertEquals(AgeDiff.CalculateAge(2010, 1900), "You will be born in 110 years.");
        assertEquals(AgeDiff.CalculateAge(2010, 1500), "You will be born in 510 years.");
        assertEquals(AgeDiff.CalculateAge(2011, 2012), "You are 1 year old.");
        assertEquals(AgeDiff.CalculateAge(2000, 1999), "You will be born in 1 year.");

    }
}
