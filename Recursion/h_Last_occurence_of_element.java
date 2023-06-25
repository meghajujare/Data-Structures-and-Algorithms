
public class h_Last_occurence_of_element {
    public static int Last_occurence(int arr[], int key, int i) {
        if (arr[i] == key)
            return i;

        if (i == 0)
            return -1;

        return Last_occurence(arr, key, i - 1);
    }

    // OR
    public static int lastOccurence(int arr[], int key, int i) {
        if (i == arr.length - 1)
            return -1;
        int isFound = lastOccurence(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key)
            return i;
        return isFound;

    }

    public static void main(String args[]) {
        int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 2, 3, 5, 8, 7 };
        System.out.println(Last_occurence(arr1, 5, arr1.length - 1));
        System.out.println(lastOccurence(arr1, 5, 0));
    }

}