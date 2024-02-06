import java.util.*;

public class EvenOrNot {
    public static boolean evenOrNot(int n) {
        boolean flag = false;
        if(n % 2 == 0 ){
            flag = true;
        } 
        return flag;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is Even or Not: ");
        int n = sc.nextInt();
        if(evenOrNot(n)) {
            System.out.println("The number is Even");
        } else {
            System.out.println("The number is NOT Even");
        }
    }
}
