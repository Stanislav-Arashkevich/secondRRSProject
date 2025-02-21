package codewarsTests;

import codewars.PrintAbbreviate;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class AbbrevNameTest {

    @Test
    public void testFixed() {
        assertEquals("S.H", PrintAbbreviate.abbrevName("Sam Harris"));
        assertEquals("P.F", PrintAbbreviate.abbrevName("Patrick Freeman"));
        assertEquals("E.C", PrintAbbreviate.abbrevName("Evan Cole"));
        assertEquals("P.F", PrintAbbreviate.abbrevName("P Fuzzily"));
        assertEquals("D.M", PrintAbbreviate.abbrevName("David Mendieta"));
    }
}
