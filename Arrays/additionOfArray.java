package Arrays;

public class additionOfArray {
    public static void main(String[] args) {
        int a[][] = {{1,2,3,4},{5,6,7,8}};
        int b[][] = {{5,6,7,8},{5,6,7,8}};
        int c[][] = new int[a.length][a[0].length];
        for (int i=0; i<a.length; i++){
            for (int j=0; j<a[i].length; j++){
                int st = a[i][j];
                int nd = b[i][j];
                int add = st + nd;
                c[i][j] = add;
            }
        }
        for (int i=0; i<a.length; i++){
            for (int j=0; j<a[i].length; j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
