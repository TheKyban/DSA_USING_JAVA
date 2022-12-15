package DSA.Arrays;

import java.util.Arrays;

public class SuffixSum {

    //with Extra Space
    static int[] sumWithSpace(int[] arr) {
        int n = arr.length;
        int[] newArr = new int[n];
        newArr[n-1] = arr[n-1];
        for (int i=n-2; i>=0; i--) {
            newArr[i] = newArr[i+1] + arr[i];
        }
        return newArr;
    }

    //WithOut Extra Space
    static void Sum(int[] arr) {
        int n = arr.length;
        for (int i=n-2; i>=0; i--) {
            arr[i] = arr[i] + arr[i+1];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        // int[] newArr = sumWithSpace(arr);
        // System.out.println(Arrays.toString(newArr));
        Sum(arr);
        System.out.println(Arrays.toString(arr));
    }
}
