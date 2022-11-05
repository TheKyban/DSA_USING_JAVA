package Patterns_Questions;

import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt(); sc.close();
        for (int i=1; i<=h; i++) {
            for (int j=1; j<=w; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
