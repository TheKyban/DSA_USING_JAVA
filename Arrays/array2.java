package Arrays;

import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        int b[][] = new int[n][n];

        //taking input for a array
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("**********");

        //taking input for b array
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        sc.close();

        // printing a array items
        System.out.println("***************");
        for (int i=0; i<a.length; i++){
            for (int j=0; j<a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        
        // printing b array items
        System.out.println("**************");
        for (int i=0; i<a.length; i++){
            for (int j=0; j<a[i].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
