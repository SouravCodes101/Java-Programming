import java.util.*;

public class TwoDArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the 2D array: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int numbers[][] = new int[n][m];
        System.out.println("Enter the values of the array . . .");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the number to be searched in the array: ");
        int num = sc.nextInt();

        // System.out.println("The index of the location for the number to be searched
        // is");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (numbers[i][j] == num) {
                    System.out.println("The index of the location for the number to be searched is = " + i + " X " + j);
                }
            }
            System.out.println();
        }
    }
}
