package lab4;

import static lab4.task3.printFigure;

public class task4 {

    public static void main(String[] args) {
        int triangleLong = 9;
        int figureHeight = triangleLong / 2 + triangleLong % 2;

        char[][] figure = new char[figureHeight][triangleLong];
        for (int i = 0; i < figureHeight; i++) {
            for (int j = i; j < triangleLong; j++) {
                figure[i][j] = '+';
            }
            triangleLong-=1;
        }
        printFigure(figure);
    }

    public static void printFigure(char[][] figure) {
        for (int i = 0; i < figure.length; i++) {
            for (int symbol = 0; symbol < figure[i].length; symbol++) {
                System.out.print(figure[i][symbol]);
            }
            System.out.println("");
        }
    }


}
