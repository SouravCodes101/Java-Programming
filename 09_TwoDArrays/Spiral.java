import java.util.*;

public class Spiral {
    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        int row_start = 0;
        int row_end = matrix.length - 1;
        int col_start = 0;
        int col_end = matrix[0].length - 1;

        while (row_start <= row_end && col_start <= col_end) {
            for (int col = col_start; col <= col_end; col++) {
                System.out.print(matrix[row_start][col] + " ");
            }
            row_start++;

            for (int row = row_start; row <= row_end; row++) {
                System.out.print(matrix[row][col_end] + " ");
            }

            col_end--;

            for (int col = col_end; col >= col_start; col--) {
                System.out.print(matrix[row_end][col] + " ");
            }

            row_end--;

            for (int row = row_end; row >= row_start; row--) {
                System.out.print(matrix[row][col_start] + " ");
            }

            col_start++;

            System.out.println();
        }
    }
}
