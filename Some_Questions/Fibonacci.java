package Some_Questions;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int turns = sc.nextInt();
        sc.close();

        int num1 = 0, num2=1;
        if (turns==1){
            System.out.println("0");
        } else if (turns==2){
            System.out.println("0 1");
        } else if (turns >= 3) {
            System.out.print("0 1 ");
            while(turns-2 != 0){
                int sum = num1 + num2;
                num1 = num2;
                num2 = sum;
                System.out.print(sum+" ");
                turns--;
            }
        }
    }
}
