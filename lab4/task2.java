package lab4;

public class task2 {
    public static void main(String[] args) {
        // Высота прямоугольного треугольника равна половине основания.
        int triangleLong = 10;
        int figureHeight = triangleLong / 2 + triangleLong % 2;
        for (int i = 0; i < figureHeight; i++) { // Строка
            for (int emptySymbol = 0; emptySymbol < i; emptySymbol++) { // Пустые символы
                System.out.print(" ");
            }

            for (int j = 0; j < triangleLong; j++) { // Основа треугольника [рёбра, основание]
                System.out.print("+");
            }
            triangleLong -= 2;
            System.out.println();
        }
    }
}
