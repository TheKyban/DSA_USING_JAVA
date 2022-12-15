import java.util.Scanner;

public class multiplication {
    static void mul(int[][] arr, int[][] arr2) {

        // matrix 1
        int r1 = arr.length;
        int c1 = arr[0].length;

        // matrix 2
        int r2 = arr2.length;
        int c2 = arr2[0].length;
        if (c1 != r2) {
            System.out.println("Wrong Dimension");
            return ;
        }

        int[][] newArr = new int[r1][c2];
        for (int i=0; i<r1; i++) {
            for (int j=0; j<c2; j++) {
                for (int k=0; k<r2; k++) {
                    newArr[i][j] += arr[i][k]*arr2[k][j];
                }
            }
        }
        System.out.println("Resultant Matrix is: ");
        PrintArr(newArr);
    }
    static void PrintArr(int[][] arr) {
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row & Column for Matrix 1 ");
        int r = sc.nextInt(), c = sc.nextInt();
        System.out.println("Enter "+ r*c + " Elements: ");
        int[][] arr = new int[r][c];
        for (int i=0; i<r; i++) {
            for (int j=0; j<c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Enter Row & Column for Matrix 2 ");
        int r1 = sc.nextInt(), c1 = sc.nextInt();
        int[][] arr2 = new int[r1][c1];
        System.out.println("Enter "+ r1*c1 + " Elements: ");
        for (int i=0; i<r1; i++) {
            for (int j=0; j<c1; j++) {
                arr2[i][j] = sc.nextInt();
            }
        } sc.close();
        mul(arr, arr2);
    }
}