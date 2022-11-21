package AssignmentLoop_2;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();sc.close();
        int a=0,b=1;
        int sum=0;
        if (num>=1) {
            System.out.print(b+" ");
        }
        for (int i=1; i<num; i++) {
            sum = a+b;
            a=b;
            b=sum;
            System.out.print(sum+" ");
        }
    }
}
