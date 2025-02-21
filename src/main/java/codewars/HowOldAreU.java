package codewars;

public class HowOldAreU {

    public static int howOld(final String herOld) {

        //your code here, return correct age as int ; )


//        return Integer.parseInt(herOld.substring(0,1));
        return Integer.parseInt(herOld.replaceAll("[^0-9]",""));
    }
}