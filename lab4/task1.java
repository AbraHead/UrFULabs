package lab4;
// Пример программы, которая выводит в консоль Прямоугольник со сторонами, ширина 15 символов, высота: 10 строк.
public class task1 {
    public static void main(String[] args) {
        int figure = 23;
        int i = 0;
        int j = 0;
        int z = 0;
        draw(figure, i, j, z);
    }
    public static void draw(int figure, int i, int j, int z) {
        for (i = 1; i<=figure; i++) {
            System.out.print("номер строки: " + i + " ");
            z = 0;
            for (j = 12; j < figure; j++) {
                System.out.print("+");
                z = z + 1;
            }
            System.out.println(" Количество символов в строке " + z);
        }
    }

}
