package Array;

public class Q5 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 4, 2, 3, 5, 7, 0};
        int max = 0;
        for (int num:arr) {
            if (num>max) {
                max = num;
            }
        }
        System.out.println(max);
    }
}