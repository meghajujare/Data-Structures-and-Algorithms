// package Recursions;

public class g_First_occurence_of_element {
    public static int First_occurence(int arr[], int key, int i) {
        if (i == arr.length)
            return -1;
        if (arr[i] == key)
            return i;
        return First_occurence(arr, key, i + 1);
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 2, 3, 5, 7 };
        System.out.println(First_occurence(arr, 5, 0));
    }

}
