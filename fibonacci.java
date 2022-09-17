import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();
        int a = 0;
        int b = 1;
        // int sum1 = 0;
        for (int i = 1; i <= num;i++){
            int sum1 = a+b;
            a = b;
            b = sum1;
            System.out.println(sum1);
        }
    }
    
}
