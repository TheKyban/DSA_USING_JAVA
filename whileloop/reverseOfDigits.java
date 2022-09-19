package whileloop;

import java.util.Scanner;

public class reverseOfDigits {
    // function for reverse the number
    static int reverseOf(int number){
        int reverseNum = 0;
        int temp = number;
        while (temp>0) {
            int lastDigit = temp%10;
            temp /= 10;
            reverseNum = reverseNum*10 + lastDigit ;
        }
        return reverseNum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        // calling reverseOf function
        System.out.println(reverseOf(a));
    }

}
