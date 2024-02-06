import java.util.*;

public class Avergae {
    public static void printAverage(int a, int b, int c) {
        int average;
        average = (a + b + c)/3;
        System.out.println("The average of " + a + ", " + b + ",and " + c + " is " + average);
        return;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers to find their average");
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.print("Enter the third number: ");
        int c = sc.nextInt();
        printAverage(a, b, c);
    }
}
