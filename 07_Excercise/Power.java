import java.util.*;

public class Power {
    public static int raisedToPower(int x, int n) {
        int raised = 1;
        for (int i = 1; i <= n; i++) {
            raised = raised * x;
        }
        return raised;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int pow = raisedToPower(x, n);
        System.out.println();
        System.out.println("x to the power of n = " + pow);
    }
}
