package Patterns_Questions;

public class rectangle3 {
    public static void main(String[] args) {
        int rows = 6;
        int col = 8;
        for (int i=1; i<=rows; i++) {
            int n =1;
            int m=2;
            for (int j=1; j<=col; j++) {
                if (i%2!=0 || col%2!=0) {
                    System.out.print(n);
                    n++;
                    if (n>2) {
                        n=1;
                    }
                } else {
                    System.out.print(m);
                    m--;
                    if (m<1) {
                        m=2;
                    }
                }
            }
            System.out.println();
        }
    }
}
