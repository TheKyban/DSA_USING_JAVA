package Selected_Assignment;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); sc.close();
        UpperStar(num);
        LowerStar(num);
    }
    // Lower Star function
    public static void LowerStar(int num) {
        int jumpNum=1;
        for (int i=2; i<=num; i++) {
            for (int j=1; j<=num-i; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=i+jumpNum; j++) {
                if ( j==1 || j==jumpNum+i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            jumpNum+=1;
            System.out.println();
        }
    }
    // Upper Star function
    public static void UpperStar(int num) {
        int jumpNum = num-1;
        for (int i=num; i>=1; i--) {
            for (int j=1; j<=num-i; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=i+jumpNum; j++) {
                if (j==1 || j==i+jumpNum) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            jumpNum--;
        }
    }
}
