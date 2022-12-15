package Conditionals;

import java.util.Scanner;

public class fifth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num = sc.nextInt();

        System.out.println("Enter number +,-,*,/,%");
        char Char = sc.next().charAt(0);

        System.out.println("Enter number 2");
        int num2 = sc.nextInt(); sc.close();

        switch (Char) {
            case '+' :
                System.out.println(num+num2);
                break;
            case '-' :
                System.out.println(num-num2);
                break;
            case '*' :
                System.out.println(num*num2);
                break;
            case '/' :
                System.out.println(num/num2);
                break;
            case '%' :
                System.out.println(num%num2);
                break;
            default:
                System.out.println("Entered Invalid Option");
        }
    }
}
