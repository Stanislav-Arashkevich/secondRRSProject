package group_QA_Java_UTC3;

/*
Используя цикл for вывести на экран прямоугольный треугольник из единиц со сторонами (катетами) 5 и 5.
То есть в первой строке должна быть одна 1, начиная слева, во второй - две и т.д.
Пример вывода на экран:

1
11
111
1111
11111
 */
public class TriangleMountain {

    public static void main(String[] args) {

        int size = 5; // Можно сделать интерактивный ввод, т.е.- запрашивать число у юзера.

        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("1");
            }
            System.out.println();
        }
    }
}
