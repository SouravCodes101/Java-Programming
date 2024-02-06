import java.util.*;

public class BitManupulation {
    public static void main(String[] args) {
        int n = 5;
        int pos = 1;
        int bitmask = 1 << pos;

        // Get Bit//! AND Operation
        // if((bitmask & n) == 0) {
        // System.out.println("bit was zero");
        // } else {
        // System.out.println("bit was one");
        // }

        // Set bit //!OR Operation
        // int newNumber = bitmask | n;
        // System.out.println(newNumber);

        // Clear bit //!AND with NOT
        // int notBitmask = ~(bitmask);
        // int newNumber = notBitmask & n;
        // System.out.println(newNumber);

        // Update bit
        // !For 0 AND with NOT
        // !For 1 OR
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 to set bit to 1 and 0 to clear bit to 0 : ");
        int opr = sc.nextInt();

        if (opr == 1) {
            // set
            int number = bitmask | n;
            System.out.println("Set Bit");
            System.out.println(number);
        } else if (opr == 0) {
            // clear
            int notBitmask = ~(bitmask);
            int number = notBitmask & n;
            System.out.println("Clear Bit");
            System.out.println(number);
        }
    }
}
