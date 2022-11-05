package Patterns_Questions;

public class rectangle2 {
    public static void main(String[] args) {
        int rows =8;
        int col = 10;
        for (int i=1; i<=rows; i++) {
            for (int j=1; j<=col; j++) {
                if (i==1 || i==rows || j==1 || j==col) {
                    System.out.print(j+"");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
