package Array.harryAssignment;

public class Q4 {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {4,5,6}
        };
        int[][] arr2 = {
            {7,8,9},
            {1,1,2}
        };
        int[][] newArray = new int[2][3];

        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                newArray[i][j] = arr[i][j] + arr2[i][j]; 
            }
        }

        for (int i=0; i<newArray.length; i++) {
            for (int j=0; j<newArray[i].length; j++) {
                System.out.print(newArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
