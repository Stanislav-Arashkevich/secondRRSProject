package codewarsTests;

import codewars.Converter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConverterTest {

    private static void doTest(int mpg, double expected) {
        String message = String.format("mpg = %d\n", mpg);
        double actual = Converter.mpgToKPM(mpg);
        assertEquals(expected, actual, 1e-3, message);
    }

    @Test
    void sampleTests() {
        doTest(10, 3.54);
        doTest(20, 7.08);
        doTest(30, 10.62);
        doTest(4145, 1467.36);
    }
}
