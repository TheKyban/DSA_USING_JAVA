package Patterns_Questions;

import java.util.Scanner;

public class hollow_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt(); sc.close();

        for (int i=1; i<=H; i++) {
            for (int j=1; j<=W; j++) {
                if (i==1 || i==H || j==1 || j==W) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
