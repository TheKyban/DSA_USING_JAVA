package Recursion;
public class recursion_1_n {
    static void printn(int n) {
        // int I = 1;
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printn(--n);
    }
    public static void main(String[] args) {
        // print n to 1
        int n = 5;
        printn(n);
    }
}
