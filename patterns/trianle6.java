package patterns;

import java.util.Scanner;

public class trianle6 {
    public static void main(String[] args) {
        //      1
        //    2   3
        //  4   5   6
        //7   8   9   10
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result = 0;
        sc.close();
        for (int i=1; i<=a; i++){
            for (int j=1; j<=2*(a-i); j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                result ++;
                System.out.print(result + "  ");
            }
            System.out.println();
        }
    }
}
