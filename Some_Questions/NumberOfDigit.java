package Some_Questions;

import java.util.Scanner;

public class NumberOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); sc.close();
        int numDigit = 0;
        while(num>0) {
            num/=10;
            numDigit ++;
        }
        System.out.println(numDigit);
    }
}
