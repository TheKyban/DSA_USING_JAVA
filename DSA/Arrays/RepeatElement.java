package DSA.Arrays;

public class RepeatElement {

    // First Repeat Number
    static int repeatElement(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int a = arr[i];
            for (int j = i + 1; j < n; j++) {
                if (a == arr[j]) {
                    return a;
                }
            }
        }
        return -1;
    }

    // last Repeat Number
    static int LastRepeatNum(int[] arr) {
        int n = arr.length;
        int lastRep = arr[0];
        for (int i = 0; i < n; i++) {
            int a = arr[i];
            for (int j = i + 1; j < n; j++) {
                int b = arr[j];
                if (a == b)
                    lastRep = a;
            }
        }
        return lastRep;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 3, 5, 3, 2, 2 };
        System.out.println(repeatElement(arr));
        System.out.println(LastRepeatNum(arr));
    }
}