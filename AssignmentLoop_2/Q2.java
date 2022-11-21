package AssignmentLoop_2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        while(sc.hasNextInt()) {
            int a= sc.nextInt();
            sum+=a;
            if (a>=0) {
                System.out.println("Sum "+sum);
            } else {
                sum = -1;
                System.out.println(sum);
                break;
            }

        }
        sc.close();
    }
}
