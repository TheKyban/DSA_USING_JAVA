package Some_Questions;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int DecimalNum = sc.nextInt(); sc.close();
        int pow = 1; // power of 10
        int BinaryNum = 0;
        while (DecimalNum>0) {
            int parity = DecimalNum%2;
            DecimalNum/=2;
            BinaryNum+=(parity*pow);
            pow*=10;
        }
        System.out.println(BinaryNum);
    }
}
