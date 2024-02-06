import java.util.*;

public class Arrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        System.out.println("Enter the elements of the array . . .");
        for(int i = 0; i<size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Here are the numbers that are stored in the array");
        System.out.print("[ ");
        for(int i = 0; i<size; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.print("]");

    }
}
