package Recursion.problemBasedOnRecursion3;

public class Q1 {
    static void pattern(int n, int m, boolean b) {
        System.out.print(n + " ");
        if (n == m && b == false)
            return;
        if (b) { // 16 11 6 1 -4 false
            if (n > 0) // 16 11 6 1 
                pattern(n - 5, m, true);
            else // 1 -4 false
                pattern(n - 5, m, false);
        } else // -4 1 6 11 16 false
            pattern(n + 5, m, false);
    }

    public static void main(String[] args) {
        pattern(16, 16, true);
    }
}
