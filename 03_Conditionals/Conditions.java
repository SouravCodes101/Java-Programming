import java.util.*;

public class Conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a= ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b= ");
        int b = sc.nextInt();
        if (a == b) {
            System.out.println("Equal");
        } else if (a > b) {
            System.out.println("a is Greater");
        } else {
            System.out.println("a is Lesser");
        }
    }
}
