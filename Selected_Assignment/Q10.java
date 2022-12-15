package Selected_Assignment;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            sum+=num;
            
            if (num<0) {
                sum=-1;
                System.out.println(sum);
                break;
            }
            System.out.print(sum +" ");
        }
        sc.close();
    }
}