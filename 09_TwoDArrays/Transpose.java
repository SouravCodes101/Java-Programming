import java.util.*;

public class Transpose {

    public static void printTranspose(int a[][], int b[][]) {
        int n = a.length;
        int m = a[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                b[j][i] = a[i][j];
            }
        }

        System.out.println("The transposed matrix is . . .");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the matrix(nXm) . . .");
        System.out.print("Enter n=");
        int n = sc.nextInt();

        System.out.print("Enter m=");
        int m = sc.nextInt();

        int a[][] = new int[n][m];
        int b[][] = new int[m][n];

        System.out.println("Enter the elements of the array/matrix . . .");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        printTranspose(a, b);
    }
}
