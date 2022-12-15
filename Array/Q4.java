package Array;

public class Q4 {
    public static void main(String[] args) {
        int [] numbers = {2, -3, 5, 8, 1, 0, -4};
        int temp = 0;
        for (int num : numbers) {
            if (num<temp) {
                temp = num;
            }
        }
        System.out.println(temp);
    }
}
