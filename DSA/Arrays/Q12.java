package DSA.Arrays;

public class Q12 {
    // Maximum and Minimum Element in a Array By Sorting
    static int MinAndMax(int[] arr) {
        int small = arr[0];
        for (int i=0; i<arr.length; i++) {
            if (small>arr[i]) {
                small=arr[i];
            }
        }
        arr[0] = small;
        return small;
    }
    public static void main(String[] args) {
        int[] array = {3,1,5,2,0};
        // for (int i=0; i<MinAndMax(array).length; i++) {
        //     System.out.println(MinAndMax(array)[i]);
        // }
        // int[] newarr = MinAndMax(array);
        // System.out.println(newarr[2]);
        System.out.println(MinAndMax(array));
    }
}
