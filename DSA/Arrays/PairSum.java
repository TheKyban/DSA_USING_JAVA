package DSA.Arrays;

public class PairSum {
    static int twoPairSum (int [] arr, int num) {
        int n = arr.length;
        int sum = 0;
        for (int i=0; i<n; i++) {
            int a = arr[i];
            for (int j=i+1; j<n; j++) {
                int b = arr[j];
                int c = a+b;
                if (c == num) sum++;
            }
        }
        return sum;
    }

    static int threePairSum (int[] arr, int num) {
        int n = arr.length;
        int sum = 0;
        for (int i=0; i<n; i++) {
            int a = arr[i];
            for (int j=i+1; j<n; j++) {
                int b = arr[j];
                for (int k=j+1; k<n; k++) {
                    int c = arr[k];
                    int d = a+b+c;
                    if (num== d) sum++;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        // int [] arr = {4,7,8,3,2,1,6,5,5};
        int [] arr = {4,7,3,21,6,5,5};
        int num = 15;
        // System.out.println(twoPairSum(arr, num));
        System.out.println(threePairSum(arr, num));
    }
}
