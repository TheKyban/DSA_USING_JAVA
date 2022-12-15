import java.util.Scanner;

public class adding2D { // ADD 2D Arrays
    static int[][] add2D(int[][] arr, int[][] arr2) {
        int r = arr.length;
        int c = arr[0].length;
        if ( r==arr2.length && c == arr2[0].length) {
            int[][] newArr = new int[r][c];
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    newArr[i][j] = arr[i][j] + arr2[i][j];
                }
            }
            return newArr;
        } else {
            System.out.println("Dimension of both Matrix should same");
        }
        return null;
    }

    static void PrintArr2D(int[][] arr) { // PrintArr
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

        int[][] arr = new int[row][column]; // Matrix 1st
        System.out.println("Enter element for 1st arr");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int[][] arr2 = new int[row][column]; // Matrix 2
        System.out.println("Enter element for 2st arr");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        sc.close();

        int[][] newArr = add2D(arr, arr2); // new Array
        PrintArr2D(newArr);
    }
}
