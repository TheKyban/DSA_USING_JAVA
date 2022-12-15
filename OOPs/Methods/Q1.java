package OOPs.Methods;

import java.util.Scanner;

public class Q1 {
    public static float AverageOfThreeNum(int a, int b, int c) {
        int sum = a+b+c;
        float ave = (float) sum/3 ;
        return ave;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt(); sc.close();
        System.out.println(AverageOfThreeNum(a, b, c));
    }
}
