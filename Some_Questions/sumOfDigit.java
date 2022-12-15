package Some_Questions;

import java.util.Scanner;

public class sumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt(); sc.close();
        int sum = 0;
        while (num>0) {
            int lastDigit = num%10;
            sum += lastDigit;
            num/=10;
        }
        System.out.println(sum);
    }
}
