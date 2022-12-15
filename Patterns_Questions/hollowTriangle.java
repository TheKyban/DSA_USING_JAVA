package Patterns_Questions;

public class hollowTriangle {
    public static void main(String[] args) {
        int n = 6; 
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=2*i-1; j++) {
                if (j==1 || j==2*i-1 || i==1 || i== n) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
