package Recursion;

public class sumOfDigit {
    static int sumOfDi(int n) {
        if (n>=0 && n<=9) return n;
        return sumOfDi(n/10) + n%10;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDi(1234));
    }
}
