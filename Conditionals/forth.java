package Conditionals;

import java.util.Scanner;

public class forth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); sc.close();
        if (num>0) {
            System.out.println(num);
        } else {
            System.out.println("The num is negative and skipped");
        }
    }
}
