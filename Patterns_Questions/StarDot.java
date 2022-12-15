package Patterns_Questions;

public class StarDot {
    public static void main(String[] args) {
        int H=4, W=6;
        for (int i=1; i<= H; i++) {
            for (int j=1; j<=W; j++) {
                if(j%2==0) {
                    System.out.print(".");
                } else {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }

    }
}
