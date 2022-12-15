package Conditionals;

import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int side1 = sc.nextInt();
        int side2 = sc.nextInt(); sc.close();
        if (side1 == side2){
            System.out.println("Square");
        } else {
            System.out.println("Rectangle");
        }
    }
}
