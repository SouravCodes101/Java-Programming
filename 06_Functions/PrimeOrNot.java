import java.util.*;

public class PrimeOrNot {
    public static boolean primeOrNot(int n) {
        if (n <= 1) {
            return false;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number to check whether it is prime or not: ");
        // int n = sc.nextInt();
        // if(primeOrNot(n)){
        //     System.out.println("The number " + n + " is a Prime Number");
        // } else {
        //     System.out.println("The number " + n + " is NOT a Prime Number");
        // }
        System.out.print("Enter the number to prime the sequence of Prime Numbers till that number: ");
        int n = sc.nextInt();
        for(int i = 2; i<=n; i++) {
            if(primeOrNot(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
