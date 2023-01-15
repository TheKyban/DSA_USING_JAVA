package Recursion;

public class naturalSum {
    static int sum(int n) {
        // 1-2+3-4....n
        if (n == 1 || n==0) return n;

        if (n%2 == 0) return sum(n-1) - n; // when n is even
        else return sum(n -1) + n; // when n is odd
    }

    public static void main(String[] args) {
        System.out.println(sum(10));
    }
}
