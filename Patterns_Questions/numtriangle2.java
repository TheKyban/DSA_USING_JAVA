package Patterns_Questions;

public class numtriangle2 {
    public static void main(String[] args) {
        int n = 4;
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            int m=2*i-1;
            for (int j=1; j<=2*i-1; j++) {
                System.out.print(m);
                if (m==j) {
                    m=1;
                }
            }
            System.out.println();
        }
    }
}
