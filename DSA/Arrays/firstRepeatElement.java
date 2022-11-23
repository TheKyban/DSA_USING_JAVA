package DSA.Arrays;

public class firstRepeatElement {
    static int repeatElement(int[] arr) {
        int n = arr.length;
        for (int i=0; i<n; i++) {
            int a = arr[i];
            for (int j= i+1; j<n ; j++) {
                if (a == arr[j]) {
                    return i+1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {0,1,3,5,3,2};
        System.out.println(repeatElement(arr));
    }
}