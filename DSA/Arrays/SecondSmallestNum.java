package DSA.Arrays;

public class SecondSmallestNum {
    // Second Smallest Number
    static int secSmallest(int[] arr) {
        int n = arr.length;
        int smallestNum = arr[0];
        int secSmallestNum = Integer.MAX_VALUE;
        // first Smallest Number
        for (int i=0; i<n; i++) {
            if (arr[i]<smallestNum) smallestNum = arr[i];
        }

        // Second Smallest Number
        for (int i=0; i<n; i++) {
            if (smallestNum != arr[i]) {
                if (arr[i]<secSmallestNum) secSmallestNum = arr[i];
            }
        }
        // return smallestNum;
        return secSmallestNum;
    }

    public static void main(String[] args) {
        int[] arr = {-1,-2,3,2,4,5,6};
        System.out.println(secSmallest(arr));
    }
}
