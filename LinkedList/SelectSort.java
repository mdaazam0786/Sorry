import java.util.Scanner;

public class SelectSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
    
        for(int i = 0;i<arr.length;i++){
            System.out.print("Enter the number : ");
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i<arr.length-1;i++){
            int smallest = i;
            for(int j = i+1; j<arr.length;j++){
                if(arr[smallest] > arr[j]){
                    arr[smallest] = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
