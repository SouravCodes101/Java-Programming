import java.util.*;

public class ArrayOfStrings {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the String Array: ");
        int size = sc.nextInt();
        String arr[] = new String[size];

        int toLength = 0;

        for (int i = 0; i < size; i++) {
            arr[i] = sc.next();
            toLength = toLength + arr[i].length();
        }

        System.out.println(toLength);
    }
}
