package Recursion;
public class fibonacci {
    static int fib(int n) {
        if (n==1) return 1;
        if (n==0) return 0;
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        int n = 5;
        for (int i=0; i<n; i++) {
            System.out.print(fib(i) + " ");
        }
        System.out.println();
    }
}
