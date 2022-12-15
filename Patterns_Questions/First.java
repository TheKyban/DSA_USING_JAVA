package Patterns_Questions;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        // *
        // * *
        // * * *
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); sc.close();

        // Using For Loop
        for (int i=1; i<=num; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        
        // Using While Loop
        int i = 1;
        while (num>0) {
            int a = i;
            while (a>0) {
                System.out.print("* ");
                a--;
            }
            System.out.println();
            i++;
            num--;
        }
    }
}
