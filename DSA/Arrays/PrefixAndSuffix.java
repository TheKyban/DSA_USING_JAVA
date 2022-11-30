package DSA.Arrays;

import java.util.Scanner;

public class PrefixAndSuffix {
    // Prefix
    static int[] Prefix(int[] arr) {
        int n = arr.length;
        int[] newArr = new int[n];
        newArr[0] = arr[0];
        for (int i = 1; i < n; i++) {
            newArr[i] = newArr[i - 1] + arr[i];
        }
        return newArr;
    }

    // Suffix
    static int[] Suffix(int[] arr) {
        int n = arr.length;
        int[] newArr = new int[n];
        newArr[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            newArr[i] = newArr[i + 1] + arr[i];
        }
        return newArr;
    }

    // Check Equal Sum of subArray of a Array
    static boolean checkSumWithPAndS(int[] arr) {
        int n = arr.length;
        int[] preSum = Prefix(arr);
        int[] sufSum = Suffix(arr);
        for (int i = 0; i <= n - 2; i++) {
            if (preSum[i] == sufSum[i + 1]) {
                return true;
            }
        }
        return false;
    }

    // total Sum
    static int totalsum(int arr[]) {
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        return totalSum;
    }

    // Check Equal Sum of subArray of a Array without suffix
    static boolean checkSum(int[] arr) {
        int n = arr.length;
        int totalSum = totalsum(arr);
        int pSum = 0;
        for (int i = 0; i < n; i++) {
            pSum += arr[i];
            int sSum = totalSum - pSum;
            if (sSum == pSum) {
                return true;
            }
        }
        return false;
    }

    // PrintArray
    static void printArray(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of Array");
        int n = sc.nextInt();
        int[] arr = new int[n]; // Array

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // taking user input
        }
        sc.close();

        System.out.println(checkSum(arr)); // checking partition of a array with equal sum is possible or not
    }
}