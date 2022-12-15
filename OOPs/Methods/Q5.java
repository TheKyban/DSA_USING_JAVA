package OOPs.Methods;

import java.util.Scanner;

public class Q5 {
    public static int MinimumNum(int a, int b, int c) {
        int min ;
        if (a<b) {
            if (a<c) {
                min = a;
            } else {
                min = c;
            }
        } else {
            if (b<c) {
                min =b;
            } else {
                min = c; 
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt(); sc.close();
        System.out.println("Minimum Number: "+MinimumNum(a, b, c));
    }
}
