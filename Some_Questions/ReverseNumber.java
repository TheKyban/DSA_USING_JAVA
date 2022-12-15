package Some_Questions;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); sc.close();
        int temp = num;
        int reverse = 0;
        while (temp>0){
            int lastDigit = temp%10;
            temp/=10;
            reverse = reverse*10 + lastDigit; 
        }
        System.out.println(reverse);
    }
}
