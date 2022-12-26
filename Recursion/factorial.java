package Recursion;
import java.util.Scanner;

public class factorial {
    static int fac(int n) {
        // base case 
        if (n == 1 || n == 0) return 1;
        return n*fac(n-1);
 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();sc.close();
        System.out.println("Factorial of " + n +": "+fac(n));
    }
}
