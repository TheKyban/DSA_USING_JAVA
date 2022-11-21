package Array;

import java.util.Scanner;

public class reverse {
    static int[] Reverse(int[] arr) {
        int n = arr.length;
        int[] newArr = new int[n];
        int temp = 0;
        for (int i=n-1; i>=0; i--) {
            newArr[temp++] = arr[i];
        }
        return newArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Length of Array: ");
        int n = sc.nextInt();

        System.out.println("Enter Elements of Array: ");
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        } sc.close();

        int[] newArr = Reverse(arr);

        for (int i:newArr) {
            System.out.print(i+" ");
        }
    }
}
