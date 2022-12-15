package Selected_Assignment;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); sc.close();
        int pr = 2;
        int prn = 2;
        for (int i=1; i<=num; i++) {
            for (int j=1; j<=num-i; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print(prn+"  ");
                pr++;
                while (pr>0) {
                    for (int p=2; p<pr; p++) {
                        if (pr%p==0) {
                            pr++;
                        } else {
                            prn = pr;
                            break;
                        }
                    }
                    break;
                }
            }
            System.out.println();
        }
    }
}
