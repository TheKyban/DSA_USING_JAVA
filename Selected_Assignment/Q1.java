package Selected_Assignment;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int NumOfCol = sc.nextInt(),NumOfRow = sc.nextInt(); sc.close();
        hollowRectangle(NumOfCol, NumOfRow);
        
    }
    // Function
    public static void hollowRectangle(int col,int rows) {
        for (int i=1; i<=col; i++) {
            for (int j=1; j<=rows; j++) {
                if (i==1 || i==col || j==1 || j==rows) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
