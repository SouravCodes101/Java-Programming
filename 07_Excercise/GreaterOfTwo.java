import java.util.*;

public class GreaterOfTwo {
    public static void printGreater(int a, int b) {
        if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else if (b > a) {
            System.out.println(b + " is greater than " + a);
        } else if (a == b) {
            System.out.println(a + " is equal to " + b);
        } else {
            System.out.println("Please enter valid numbers");
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        printGreater(a, b);
    }
}
