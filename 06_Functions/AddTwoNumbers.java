import java.util.*;

public class AddTwoNumbers {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int calculateProduct(int a, int b) {
        return a * b;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();
        System.out.println("The sum is " + sum(number1, number2));
        System.out.println("the product is " + calculateProduct(number1, number2));
    }
}
