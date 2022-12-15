package Selected_Assignment;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        // Fibonacci Series
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();sc.close();
        int a=0,b=1,sum=0;
        System.out.print(a+" "+b+" ");
        for (int i=1; i<num-1; i++) {
            sum= (a+b);
            a=b;
            b=sum;
            System.out.print(sum+" ");
        }
    }
}
