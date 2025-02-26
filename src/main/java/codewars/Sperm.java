package codewars;

public class Sperm {

    public static String chromosomeCheck(String sperm) {

        if (sperm.equals("X")){
            return "Congratulations! You're going to have a daughter.";
        } else {
            return "Congratulations! You're going to have a son.";
        }
    }
}