package AssignmentLoop_2;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.close();
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=1; i<=2*n+1; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
