import java.util.Scanner;

// class myCalculator  {
    
// }
public class Recursion {
    static long power(int n, int p) throws Exception {
        if (n==0 || p==0) {
            throw new Exception("n and p should not be zero.");
        } else if (n<0 || p<0) {
            throw new Exception("n or p should not be negative.");
        } else {
            return (long) Math.pow(n, p);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println(power(sc.nextInt(),sc.nextInt()));
        } catch (Exception e) {
            System.out.println(e);
        } sc.close();
    }
}
