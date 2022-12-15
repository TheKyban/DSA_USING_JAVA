package DSA.Arrays;

import java.util.Scanner;

public class prefixSum {

    //With Space
    static int[] PrefixSum(int[] arr) {
        int n = arr.length;
        int[] preSum = new int[n];
        preSum[0] = arr[0];
        for (int i=1; i<n; i++) {
            preSum[i] = preSum[i-1] + arr[i];
        }
        return preSum;
    }

    // WithOut Extra Space
    static void PrefixSumW(int[] arr){
        int n = arr.length;
        for (int i=1; i<n; i++) {
            arr[i] = arr[i] + arr[i-1];
        }
    }

    // Suffix Sum withOut Extra Space
    static void SuffixSum(int[]arr) {
        int n = arr.length;
        for (int i=n-2; i>=0; i--) {
            arr[i] = arr[i] + arr[i-1];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n+1]; // 1 based indexing
        for (int i=1; i<=n; i++) {
            arr[i] = sc.nextInt();
        } 
        int PreSum[] = PrefixSum(arr); // Prefix Sum of arr Array
        // System.out.println(Arrays.toString(PreSum));
        System.out.println("Enter Number of Queries: ");
        int q = sc.nextInt();
        while (q-->0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int sum = PreSum[r] - PreSum[l-1];
            System.out.println(sum);
        } sc.close();
    }
}
