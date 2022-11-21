package Selected_Assignment;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); sc.close();
        Boolean isTwoNumSumPrime = false;
        firstLoop:
        for (int i=2; i<=num; i++) {
            int a=i;
            int b=2;
            int sum=0;
            // SecondLoop:
            for (int j=2; j<=i; j++) {
                if (i%j!=0) {
                    b=j;
                    sum = a+b;
                }
                if (sum==num) {
                    isTwoNumSumPrime= true;
                    System.out.println(a+" "+b);
                    break firstLoop;
                    // break SecondLoop;
                }
            }
        }
        System.out.println(isTwoNumSumPrime);
    }
}