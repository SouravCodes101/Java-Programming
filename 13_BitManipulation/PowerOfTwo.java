import java.util.*;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (isPowerOfTwo(number)) {
            System.out.println("The number is a power of two");
        } else {
            System.out.println("The number is not a power of two");
        }

    }

    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
