package DSA.Arrays;

import java.util.Arrays;

public class SquareSort {

    // Swap
    static void swap(int[] arr, int st, int end) {
        int temp = arr[st];
        arr[st] = arr[end];
        arr[end] = temp;
    }

    // Reverse
    static void reverse (int[] arr) {
        int i=0 , j=arr.length-1;
        while (i<j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    // Square sort
    static int[] squareSort(int[]arr) {
        int i=0, j=arr.length-1;
        int[] ans = new int[arr.length];
        int temp=0;
        while (i<=j) {
            if (Math.abs(arr[i])>Math.abs(arr[j])) {
                ans[temp++] = arr[i] * arr[i];
                i++;
            } else {
                ans[temp++] = arr[j] * arr[j];
                j--;
            }
        }
        reverse(ans);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {-10,-4,3,4,5};
        int[] newArr = squareSort(arr);
        System.out.println(Arrays.toString(newArr));
    }
}
