package lab4;

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
        for (char[] chars : figure) {
            for (char aChar : chars) {
                System.out.print(aChar);
            }
            System.out.println();
        }
    }


}
