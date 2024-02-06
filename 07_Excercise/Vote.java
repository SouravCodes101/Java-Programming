import java.util.*;

public class Vote {
    public static void eligibilityToVote(int age) {
        if (age >= 18) {
            System.out.println("You Are Eligible to Vote!");
        } else if (age < 1) {
            System.out.println("Enter a valid age!");
        } else {
            System.out.println("You are NOT Eligible to Vote!");
        }
        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        eligibilityToVote(age);
    }
}
