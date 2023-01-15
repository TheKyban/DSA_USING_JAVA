package Recursion.problemBasedOnRecursion4;

public class Q2 {
    static int product(int x , int y) { // Product of two numbers using recursion
        if (x<y) { // Swaping the values
            int c = x;
            x = y;
            y = c;
        }

        if (y == 0) return 0;
        return x+product(x, y-1);
    }

    public static void main(String[] args) {
        System.out.println(product(3, 3));
    }
}
