package Patterns_Questions;

import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
    //        *
    //      * *
    //    * * *
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); sc.close();
        System.out.println("using for loop");
        for (int i=num; i>=1; i--) {
            for (int j=1; j<=2*(i-1); j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=num-i+1; j++ ) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Using While Loop
        System.out.println("using While loop");
        int temp = num;
        while (temp>0) {
            int i =1;
            int j =1;
            while (i<=2*(temp-1)) {
                System.out.print(" ");
                i++;
            }
            while (j<=(num-temp+1)) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            temp--;
        }
    }
}
