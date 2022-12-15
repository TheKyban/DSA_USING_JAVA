package Array.harryAssignment;

public class Q2 {
    static  void findNum (int[] arr , int a) {
        int temp = 0;
        for (int i:arr) {
            if (i==a) {
                temp = i;
            }
        }
        if (temp == a) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int a = 1;
        findNum(arr, a);
    }
}
