import java.util.*;

public class Order {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        boolean isAscending = true;

        System.out.println("Enter the values of the array . . .");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isAscending = false;
            }
        }

        if (isAscending) {
            System.out.println("The array is sorted in ascending order");
        } else if (!isAscending) {
            System.out.println("The array is not sorted");
        }

    }
}
