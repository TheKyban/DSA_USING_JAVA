import java.util.Scanner;

public class taking2DInput {
    static void PrintArr2D(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Taking user input for 2D Array ///////////

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and column: ");
        int row = sc.nextInt();
        int column = sc.nextInt();
        int totalElement = column * row;
        System.out.println("Enter " + totalElement + " Elements");
        int[][] arr = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = sc.nextInt();
            }
        } sc.close();

        /////////////////////////////////////////
        // Printing The Array
        PrintArr2D(arr);
    }
}
