package codewarsTests;

import codewars.Banjo;
import org.testng.annotations.Test;

import java.util.Random;

import static org.testng.Assert.assertEquals;

public class BanjoExampleTest {


    @Test
    public void PeopleThatPlayBanjo() {

//        String[] lst = {"Adam", "Bob", "chelsea", "daniel", "Ethan", "fanny", "george", "harry",
//                "Ignatious", "Kyle", "Lavender", "michelle", "peter", "Ragu", "Ryle", "Reaven",
//                "royce", "richard", "rubi", "Reanor", "resh", "Samantha", "trishan", "valde"};
//
//
//        Random r = new Random();
//        for(int i = 0; i < 100; i++){
//            String s = lst[r.nextInt(lst.length)];
//            assertEquals(Banjo.areYouPlayingBanjo(s), Banjo.areYouPlayingBanjo(s));
//        }
        assertEquals( "Martin does not play banjo", "Martin does not play banjo", Banjo.areYouPlayingBanjo("Martin"));
        assertEquals( "Rikke plays banjo", "Rikke plays banjo", Banjo.areYouPlayingBanjo("Rikke"));
        assertEquals( "rolf plays banjo", "rolf plays banjo", Banjo.areYouPlayingBanjo("rolf"));
        assertEquals( "bravo does not play banjo", "bravo does not play banjo", Banjo.areYouPlayingBanjo("bravo"));
    }
}