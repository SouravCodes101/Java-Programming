import java.util.*;

public class CountNumbers {
    public static void countNum(int n) {
        Scanner sc = new Scanner(System.in);

        int countZero = 0;
        int countPositive = 0;
        int countNegative = 0;

        while (n == 1) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            if (num < 0) {
                countNegative++;
            } else if (num > 0) {
                countPositive++;
            } else if (num == 0) {
                countZero++;
            }
            System.out.print("Press 1 to enter number or 0 to exit: ");
            n = sc.nextInt();
        }
        System.out.println();
        System.out.println(
                "The number of zeros you entered = " + countZero);
        System.out.println();
        System.out.println("The number of positive numbers you entered = "
                + countPositive);
        System.out.println();
        System.out.println("The number of negative numbers you entered = " + countNegative + " .");
        System.out.println();
        if (n == 0) {
            System.out.println("Exiting . . .");
            return;
        } else {
            System.out.println("Invalid entry!");
            return;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Press 1 to enter number or 0 to exit: ");
        int n = sc.nextInt();
        countNum(n);
    }
}