package group_QA_Java_UTC3.drawing;

public class Ring {

    public static void main(String[] args) {

        int ringSize = 15;
        int radius = 5;

        drawingRing(ringSize, radius);
        System.out.println();
        drawOval(ringSize, ringSize);
        System.out.println();
        drawRing(ringSize, ringSize * 2);
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

    private static void drawOval(int height, int width) {
        // Проходим по каждой строке
        for (int y = 0; y < height; y++) {
            // Проходим по каждой колонке
            for (int x = 0; x < width; x++) {
                // Уравнение эллипса: ((x - centerX) ^ 2) / (radiusX ^ 2) + ((y - centerY) ^ 2) / (radiusY ^ 2) ≤ 1
                // centerX и centerY - центры овала
                // radiusX - радиус по горизонтали
                // radiusY - радиус по вертикали
                double centerX = width / 2.0;
                double centerY = height / 2.0;
                double radiusX = width / 4.0;
                double radiusY = height / 6.0;

                // Проверяем, находится ли точка (x, y) внутри овала
                if (Math.pow((x - centerX) / radiusX, 2) + Math.pow((y - centerY) / radiusY, 2) <= 1) {
                    System.out.print("0 "); // Печатаем символ
                } else {
                    System.out.print(". "); // Печатаем пробел
                }
            }
            System.out.println(); // Перемещаемся на новую строку
        }
    }

    private static void drawRing (int width, int height) {
//        int height = 15; // Высота овала
//        int width = 30; // Ширина овала
        int radiusX = width / 4; // Горизонтальный радиус
        int radiusY = height / 6; // Вертикальный радиус

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                // Уравнение эллипса
                if (Math.pow((x - width / 2.0) / radiusX, 2) +
                        Math.pow((y - height / 2.0) / radiusY, 2) <= 1) {
                    System.out.print(" 0"); // Символ внутри овала
                } else {
                    System.out.print(" ."); // Пробел
                }
            }
            System.out.println(); // Перенос строки
        }
    }
}
