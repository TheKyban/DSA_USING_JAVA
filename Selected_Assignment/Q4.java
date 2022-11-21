package Selected_Assignment;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); sc.close();
        verticalStar(num);
        horizontalStar(num);
        verticalStar(num);
    }
    // Function
    public static void verticalStar(int a) {
        for (int i=1; i<=a; i++) {
            for (int j=1; j<=a+1; j++) {
                if (j==a+1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void horizontalStar(int a) {
        for (int i=1; i<=2*a+1; i++) {
            System.out.print("*");
        }
        System.out.println();
        
    }
}
