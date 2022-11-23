package DSA.Arrays;

public class Swap {
    public static void swapArray(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        swapArray(arr, 0, 4);
        for (int i:arr) {
            System.out.print(i+" ");
        }
    }
}
