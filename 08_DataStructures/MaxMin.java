import java.util.*;

public class MaxMin {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array = ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the elements of the array . . .");
        for(int i = 0; i<arr.length; i++) {
            arr[i]= sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i< arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Minimum Value in the array is " + min);
        System.out.println("maximum Value in the array is " + max);
    }

}