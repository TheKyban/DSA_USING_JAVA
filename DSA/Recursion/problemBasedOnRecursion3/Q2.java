package Recursion.problemBasedOnRecursion3;

public class Q2 {
    static int Sum(int n , int m) {
        if (m == n) return n;
        if (m>1) {
            return Sum(n+Sum(n-1, m-1), 1);
        } else {
            return n+Sum(n-1, m);
        }
        
    }
    public static void main(String[] args) {
        System.out.println(Sum(4, 3));
    }
}
