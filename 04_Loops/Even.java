import java.util.*;

public class Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (1 to Enter Marks or 0 to Exit) : ");
        int number = sc.nextInt();
        if (number == 1) {
            do {
                System.out.print("Enter marks: ");
                int marks = sc.nextInt();
                if (marks >= 90) {
                    System.out.println("This is Good");
                } else if (marks <= 89 && marks >= 60) {
                    System.out.println("This is also Good");
                } else if (marks <= 59 && marks >= 0) {
                    System.out.println("This is Good as well");
                }
                System.out.print("Enter a number ( 1 or 0) : ");
                number = sc.nextInt();
                if (number == 1) {
                    System.out.println("Continue . . . ");
                } else {
                    System.out.println("Exiting . . .");
                }
            } while (number == 1);
        } else if (number == 0) {
            System.out.println("Exiting . . . ");
        }

    }
}
