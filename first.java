import java.util.Scanner;

public class first {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // first input
       
        System.out.println("enter:");
        int a = sc.nextInt();
        System.out.println("Enter your name: ");
        int b = sc.nextInt();
        int O = a + b;
        System.out.println("Hello "+ O);
    }
}

