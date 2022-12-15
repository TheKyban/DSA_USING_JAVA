package DSA.Arrays;

import java.util.Arrays;

public class rotateLastElement {

    //Swap
    static void swap(int[] arr, int st, int end) {
        int temp = arr[st];
        arr[st] = arr[end];
        arr[end] = temp;
    }

    // Reverse
    static void reverse (int[] arr, int i, int j) {
        while (i<j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    // with extra spaces 
    static int[] Rotate(int[] arr , int k) {
        int n = arr.length;
        k= k%n;
        int temp = 0;
        int [] newArr = new int[n];
        for (int i = n-k; i<n; i++) {
            newArr[temp++] = arr[i];
        }
        for (int i = 0; i<n-k; i++) {
            newArr[temp++] = arr[i];
        }
        return newArr;
    }

    // without extra space
    static void RotateWithOut(int [] arr, int k) {
        int n = arr.length;
        k = k%n;
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 6;
        // int[] newArr = Rotate(arr, k);
        // System.out.println(Arrays.toString(newArr));

        // swap(arr, 1, 4);
        
        // reverse(arr, 0,2);
        RotateWithOut(arr, k);
        System.out.println(Arrays.toString(arr));
    }
}
