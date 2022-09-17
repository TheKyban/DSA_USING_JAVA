package patterns;

import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        // * * * *
        // * * * *
        // * * * *
        // * * * *

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        scan.close();
        
        for (int i=1; i<=a; i++ ) {
            for (int j=1; j<=a; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    
}
