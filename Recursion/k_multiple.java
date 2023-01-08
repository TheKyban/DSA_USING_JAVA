package Recursion;

public class k_multiple {
    static void printKMultiple(int p,int k) {
        if (k==0) return;
        printKMultiple(p,k-1);
        System.out.print(p*k + " ");
        return;
    }

    public static void main(String[] args) {
        printKMultiple(12, 5);
        System.out.println();
    }
}
