package Some_Questions;

import java.util.Scanner;

public class firstNFactorial {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt(),fact=1; sc.close();
        for (int i=1; i<=num; i++)
        {
            fact*=i;
            System.out.print(fact + " ");
        }
    }
}
