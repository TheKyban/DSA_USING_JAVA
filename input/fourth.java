package input;
import java.util.Scanner;

public class fourth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of test cases: ");
        int test_cases = sc.nextInt();
        int i = 0;
        while(i<test_cases){
            System.out.println("Enter two numbers: ");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.println(num1+num2);
            i++;
        }
        sc.close();
    }
}
