package group_QA_Java_UTC3.drawing;

public class Ring {

    public static void main(String[] args) {

        int ringSize = 15;
        int radius = 5;

        drawingRing(ringSize, radius);
    }

    private static void drawingRing(int ringSize, int radius) {

        for (int y = 0; y < ringSize; y++) {
            for (int x = 0; x < ringSize; x++) {
                if ((x - ringSize / 2) * (x - ringSize / 2) +
                        (y - ringSize / 2) * (y - ringSize / 2) < Math.pow(radius, 2)) {
                    System.out.print(" 0"); // ☠️
                } else {
                    System.out.print(" .");
                }
            }

            System.out.println();
        }
    }
}