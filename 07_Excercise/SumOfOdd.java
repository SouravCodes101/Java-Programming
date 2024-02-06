import java.util.*;

public class SumOfOdd {
    public static void printSumOfOddNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println("The sum of Odd Numbers for n is " + sum);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        printSumOfOddNumbers(n);
    }
}
