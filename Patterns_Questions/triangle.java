package Patterns_Questions;

public class triangle {
    public static void main(String[] args) {
        int n=4;
        for (int i=1; i<=n+3; i++) {
            for (int j=0; j<n-i; j++) {
                System.out.print(" ");
            }
            
            System.out.print("\n");
        }
    }
}
