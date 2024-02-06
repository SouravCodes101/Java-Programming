import java.util.*;

public class Factorial {
    public static void printFactorial(int n) {
        if (n < 0) {
            System.out.println("Invalid Number!");
            return;
        }

        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of " + n + " is " + factorial);
        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to calculate factorial: ");
        int n = sc.nextInt();
        printFactorial(n);
    }
}
