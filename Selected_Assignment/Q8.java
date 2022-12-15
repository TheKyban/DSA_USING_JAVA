package Selected_Assignment;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); sc.close();
        int fact = 1; 
        for (int i=1; i<=num; i++) {
            fact*=i;
        }
        System.out.println("Factorial Of "+num+" is "+fact);

        int sum=0;
        for (int i=1; i<=num; i++) {
            int tempfact=1;
            for (int j=1; j<=i; j++) {
                tempfact*=j;
            }
            sum+= tempfact;
        }
        System.out.println("The Sum of "+num+"!"+" to 1!"+" is "+sum);
    }
}
