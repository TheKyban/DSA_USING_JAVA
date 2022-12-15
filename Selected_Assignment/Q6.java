package Selected_Assignment;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); sc.close();
        int jump = 0;
        for (int i=1; i<=num; i++) {
            int letter = 65;
            for (int j=1; j<=num-i; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=(i+jump); j++) {
                System.out.print((char) letter);
                letter++;
            }
            jump+=1;
            System.out.println();
        }
        int jp = num-1-1;
        for (int i=num-1; i>=1; i--) {
            for (int j=1; j<=num-i; j++) {
                System.out.print(" ");
            }
            int letter = 65;
            for (int j=1; j<=i+jp; j++) {
                System.out.print((char) letter);
                letter++;
            }
            System.out.println();
            jp--;
        }
    }
}
