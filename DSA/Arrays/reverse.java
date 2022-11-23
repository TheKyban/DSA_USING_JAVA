package DSA.Arrays;

import java.util.Arrays;

public class reverse {
    // With Space
    static int[] Reverse (int[] arr) {
        int n = arr.length;
        int[] newArr = new int[n];
        int temp = 0;
        for (int i=n-1; i>=0; i--) {
            newArr[temp++] = arr[i];
        }
        return newArr;
    }

    // Without Space
    static void ReverseWithoutSpace (int[] arr) {
        int n = arr.length;
        int temp = n-1;
        for (int i=0; i<n/2; i++) {
            int tempV = arr[i];
            arr[i] = arr[temp];
            arr[temp--] = tempV;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        ReverseWithoutSpace(arr);
        System.out.println(Arrays.toString(arr));
    }
}