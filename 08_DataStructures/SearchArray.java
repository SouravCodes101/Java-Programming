import java.util.*;

public class SearchArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the elements of the array . . .");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number to search in the array: ");
        int x = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                System.out.println("The number " + x + " is stored in index " + i);
            }
        }
    }
}
