package school.redrover.hw.hw11.hw11_2;

public class Position {

    public static String getPosition (char letter) {

        char[] alphabet = new char[26];
        for (int i = 0; i <= 25; i++) {
            alphabet[i] = (char) (i + 97);
        }

        int pos = 0;

        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] == letter) {
                pos = i + 1;
            }
        }

        return "Position of alphabet: " + pos;
    }
}