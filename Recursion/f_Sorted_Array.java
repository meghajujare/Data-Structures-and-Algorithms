// package Recursions;
// To check if an array is sorted or not
// example 1: a[]= { 1, 2, 6, 4, 5, 6 };
// output: false
// example 2:a[]= { 1, 2, 3, 4, 5, 6 };
// output: true
public class f_Sorted_Array {
    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1)
            return true;
        if (arr[i] > arr[i + 1])
            return false;
        return isSorted(arr, i + 1);

    }

    public static void main(String args[]) {
        int a[] = { 1, 2, 3, 4, 5, 6 };
        System.out.println(isSorted(a, 0));
        // i indicates the index from which the sorting has to be checked
    }
}
