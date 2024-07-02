package lab4;
import java.util.Random;

public class task5 {
    public static void main(String[] args) {
        Random random = new Random(42);
        int i = 5;
        int j = 3;
        int[][] matrix = new int[i][j];
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 3; j++) {
                matrix[i][j] = random.nextInt();
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] matrixT(int[][] matrix) {
        // matrixT code
        return matrix;
    }
}
