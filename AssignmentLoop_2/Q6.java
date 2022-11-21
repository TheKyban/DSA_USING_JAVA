package AssignmentLoop_2;

public class Q6 {
    public static void main(String[] args) {
        // System.out.println((char) (64+26));
        int n=5;
        for (int i=1; i<=n; i++) {
            int c=65;
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=2*i-1; j++) {
                System.out.print((char) c);
                c++;
            }
            System.out.println();
        }

        for (int i=n-1; i>=1; i--) {
            int c =65;
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=2*i-1; j++) {
                System.out.print((char) c);
                c++;
            }
            System.out.println();
        }
    }
}
