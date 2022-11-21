package Array;

import java.util.Scanner;

public class rotateArray {
    static int[] RotateArray (int[] arr, int k) {
        int n = arr.length;
        k = k%n;
        int temp = 0;
        int[] newArray = new int[n];
        for (int i = n-k; i<n; i++) {
            newArray[temp++] = arr[i];
        }
        for (int i=0; i<n-k; i++) {
            newArray[temp++] = arr[i];
        }
        return newArray;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Length of Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter Elements of Array: ");
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Number of Rounds");
        int k = sc.nextInt(); sc.close();
        
        int[] newArr = RotateArray(arr, k);
        for (int i:newArr) {
            System.out.print(i+" ");
        }
    }
}
