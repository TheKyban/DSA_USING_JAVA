package Recursion.problemBasedOnRecursion4;

public class Q1 {
    // ArmStrong Number
    static boolean armStrong(int num, int num2, int sum) {
        if (num == 0 && sum == num2) return true;
        else if (num == 0 && sum != num2) return false;
        int lastDigit = num%10;
        sum += Math.pow(lastDigit, 3);
        num = num/10;
        return  armStrong(num, num2, sum);
    }

    public static void main(String[] args) {
        int n = 371;
        System.out.println(armStrong(n, n, 0));
    }
}
