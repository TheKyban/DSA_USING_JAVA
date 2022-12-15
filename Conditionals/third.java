package Conditionals;

import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c_p = sc.nextInt();
        int s_p = sc.nextInt(); sc.close();

        int profit = (s_p-c_p)>0?(s_p-c_p):0;
        int loss = ((c_p-s_p)>0)?(c_p-s_p):0 ;

        System.out.println("loss "+ loss);
        System.out.println("profit "+ profit);
    }
}
