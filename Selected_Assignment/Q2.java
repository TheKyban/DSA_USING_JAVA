package Selected_Assignment;

public class Q2 {
    public static void main(String[] args) {
        int n = 5;
        int m = 3;
        StarDot(n, m);
    }
    // Function
    public static void StarDot(int n , int m) {
        for (int i = 1; i <= n; i++) {
    
            for (int j = 1; j <= 3; j++) {
                if (i % 2 == 0) {
                    System.out.print(". ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.print("\n");
        }
    }
}
