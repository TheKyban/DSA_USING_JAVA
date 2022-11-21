package Some_Questions;

import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); sc.close();

        for (int i=1; i<=num; i++) {
            int sum=0;
            int temp = i;
            while (temp>0) {
                int lastDigit = temp%10;
                sum += Math.pow(lastDigit, 3);
                temp/=10;
            }
            if (sum== i) {
                System.out.print(sum+" ");
            }
        }
    }
}
