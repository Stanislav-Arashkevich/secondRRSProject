package codewarsTests;

import codewars.BMI;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class BMITest {

    @Test
    void testBMI() {
        assertEquals("Underweight", BMI.bmi(50, 1.80), "For weight = 50 and height = 1.80");
        assertEquals("Normal", BMI.bmi(80, 1.80), "For weight = 80 and height = 1.80");
        assertEquals("Overweight", BMI.bmi(90, 1.80), "For weight = 90 and height = 1.80");
        assertEquals("Obese", BMI.bmi(100, 1.80), "For weight = 100 and height = 1.80");
        assertEquals("Underweight", BMI.bmi(74, 2.00), "For weight = 74 and height = 2.00");
        assertEquals("Normal", BMI.bmi(100, 2.00), "For weight = 100 and height = 2.00");
        assertEquals("Overweight", BMI.bmi(65, 1.50), "For weight = 65 and height = 1.50");
    }
}
