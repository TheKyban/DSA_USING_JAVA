package DSA.Arrays;

import java.util.Arrays;

public class positiveFirst {
    static void sort(int arr[]) {
        int n = arr.length;
        int temp = 0;
        for (int i=0; i<n; i++) {
            if (arr[i] >= 0) {
                int tVar = arr[i];
                arr[i] = arr[temp];
                arr[temp++] = tVar;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {-1,6,2,-2,-3,5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
