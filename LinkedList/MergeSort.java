import java.util.Scanner;

public class MergeSort {

    public static void Conquer(int arr[], int start, int mid, int end) {
        int merged[] = new int[end - start + 1];
        int idx1 = start;
        int idx2 = mid + 1;
        int x = 0;

        // sorting the divided array
        while (idx1 <= mid && idx2 <= end) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x] = arr[idx1];
                x++;
                idx1++;
            } else {
                merged[x] = arr[idx2];
                x++;
                idx2++;
            }
        }
        // Adding the rest sorted elements into the array
        while (idx1 <= mid) {
            merged[x] = arr[idx1];
            x++;
            idx1++;
        }
        while (idx2 <= end) {
            merged[x] = arr[idx2];
            x++;
            idx2++;
        }
        // Copying the elements into the main array
        for (int i = 0, j = start; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void Divide(int arr[], int start, int end) {
        if (start >= end) {
            return;
        }
        // finding mid then divide the array
        int mid = start + (end - start) / 2;
        Divide(arr, start, mid);
        Divide(arr, mid + 1, end);
        Conquer(arr, start, mid, end);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the number : ");
            arr[i] = sc.nextInt();
        }
        // Calling the function to divide the main array
        Divide(arr, 0, n - 1);
        // Printing the array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
