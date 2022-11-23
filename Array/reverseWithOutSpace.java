package Array;

import java.util.Arrays;

public class reverseWithOutSpace {
    public static void Reverse(int[] arr) {
        int n = arr.length;
        int temp = n - 1;
        for (int i = 0; i < n/2; i++) {
            int tVar = arr[i];
            arr[i] = arr[temp];
            arr[temp--] = tVar;
        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 ,5,6,7};
        Reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}
