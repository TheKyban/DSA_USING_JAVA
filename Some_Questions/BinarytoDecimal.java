package Some_Questions;

import java.util.Scanner;

public class BinarytoDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Binarynum = sc.nextInt(); sc.close();
        int pow =1; // power of 2
        int number =0;
        while (Binarynum>0) {
            int lastDigit = Binarynum%10;
            number += (lastDigit*pow);
            pow*=2;
            Binarynum/=10;
        }
        System.out.println(number);
    }
}
