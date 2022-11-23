package DSA.Arrays;

public class secondLargestNum {
    static int SecondLargest(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for (int i=0; i<n; i++) {
            if (arr[i]>max) max = arr[i];
        }

        for (int i=0; i<n; i++) {
            if (arr[i] != max) {
                if (arr[i] > smax) smax = arr[i];
            }
        }
        return smax;
    }

    public static void main(String[] args) {
        int [] arr = {1,3,2,7,11,4,5,6};
        System.out.println(SecondLargest(arr));
    }
}
