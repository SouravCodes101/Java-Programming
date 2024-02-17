public class ArraySorted {
    public static boolean isSorted(int arr[], int idx) {
        if (idx == arr.length - 1) {
            return true;
        }
        if(arr[idx] < arr[idx + 1]) {
            //array is sorted till now
            return isSorted(arr, idx + 1);
        } else {
            return false;
        }
        // if (arr[idx] >= arr[idx + 1]) {
        //     // array is unsorted 
        //     return false;
        // } 

        // return isSorted(arr, idx + 1);

    }

    public static void main(String[] args) {
        int arr[] = { 1,3,6};
        boolean sorted = isSorted(arr, 0);
        System.out.println(sorted);
    }
}
