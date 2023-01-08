package Recursion;

class greaterCommonDivisor {
    int ans; // variable
    int igcd(int a, int b) { // using iteration
        for (int i = a; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                ans = i;
                break;
            }
        }
        return ans;
    }

    int gcd(int x, int y) { // using recursion
        if (y % x == 0) return x;
        return gcd(y%x, x);
    }
}

public class GCD {

    public static void main(String[] args) {

        greaterCommonDivisor hcf = new greaterCommonDivisor(); // making a object
        System.out.println(hcf.igcd(12, 16)); // using iteration
        System.out.println(hcf.gcd(12, 16));  // using recursion
    }
}
