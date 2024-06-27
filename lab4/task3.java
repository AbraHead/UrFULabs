package lab4;

public class task3 {
    public static void main(String[] args) {
        int triangleLong = 10;
        int figureHeight = triangleLong / 2 + triangleLong % 2;
        // int triangleSymbol = 5;
        int[][] figure = new int[figureHeight][triangleLong];
        for (int i = 0; i < figureHeight; i++) {
            for (int j = i; j < triangleLong; j++) {
                figure[i][j] = 2;
            }
            triangleLong-=1;
        }
        printFigure(figure);
    }

    public static void printFigure(int[][] figure) {
        for (int i = 0; i < figure.length; i++) {
            for (int symbol = 0; symbol < figure[i].length; symbol++) {
                System.out.print(figure[i][symbol]);
            }
            System.out.println();
        }
    }
    public static void printFigure(char[][] figure){}
}
