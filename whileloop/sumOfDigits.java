package whileloop;

import java.util.Scanner;

public class sumOfDigits {
    // function for sum of digits 
    static int sumOf(int number) {
        int sum = 0;
        int temp = number;
        while (temp > 0) {
            int lastDigit = temp%10;
            temp /= 10 ;
            sum += lastDigit;
        }
        return sum;
    }
    // function for to check digits in a number
    static int numberOfDigitsIn(double number) {
        int digitsIn = (int) Math.log10(number) + 1;
        return digitsIn;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        // recalling sumOf function
        System.out.println("sum of digits is " + sumOf(a));
        // recalling numberOfDigitsIn function
        System.out.println("Number of Digits in " + a + " is " + numberOfDigitsIn(a));
    }
}
