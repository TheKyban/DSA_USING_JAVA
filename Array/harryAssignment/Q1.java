package Array.harryAssignment;

import java.util.Scanner;

public class Q1 {
    static float calSum(float[] arr) {
        float sum = 0; 
        for (float i:arr) {
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] arr = new float[5];
        for (int i=0; i<5; i++) {
            arr[i] = sc.nextFloat();
        }
        sc.close();
        System.out.println(calSum(arr));
    }
}
