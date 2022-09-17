package patterns;

import java.util.Scanner;

public class triangle1 {
    public static void main(String[] args) {
        // *  *  *  *
        // *  *  *
        // *  * 
        // *
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        scan.close();
        for (int i=a; i>=1; i--) {
            for (int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
