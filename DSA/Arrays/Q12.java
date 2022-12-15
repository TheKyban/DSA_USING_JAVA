package DSA.Arrays;

// Maximum and Minimum Element in a Array By Sorting
public class Q12 {
    
    // For Minimum
    static int MinAndMax(int[] arr) {
        int small = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (small > arr[i]) {
                small = arr[i];
            }
    }
        arr[0] = small;
        return small;
    }
    
    // For Maximum
    static int Max(int[] array) {
        int maximumNum =array[0];
        for (int i=0; i<array.length; i++) {
            if (array[i]>maximumNum) {
                maximumNum=array[i];
            }
        }
        return maximumNum;
    }

    public static void main(String[] args) {
        int[] array = { 3, 1, 5, 2, 0 };
        System.out.println("Min "+MinAndMax(array));
        System.out.println("Max "+Max(array));
    }
}
