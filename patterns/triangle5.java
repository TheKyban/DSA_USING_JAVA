package patterns;

import java.util.Scanner;

public class triangle5 {
    public static void main(String[] args) {
        //       *
        //     *   *
        //   *   *   *
        // *   *   *   *
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        for (int i=1; i<=a; i++){
            for (int j=1; j<=2*(a-i); j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("   ");
            }
            System.out.println();
        }
    }
}
