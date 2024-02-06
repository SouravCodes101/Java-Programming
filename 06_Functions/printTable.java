import java.util.*;

public class printTable {
    public static void printTheTable(int n){
        for(int i = 1;i<=10; i++) {
            System.out.println(n + " X " + i + " = " + n * i);
        }
        return;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print the Table for: ");
        int n = sc.nextInt();
        System.out.println("The Table for " + n + " is . . . "); 
        printTheTable(n);
    }
}
