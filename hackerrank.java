import java.util.Scanner;

public class hackerrank {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // System.out.println("int");
        int i = scan.nextInt();
        // System.out.println("double");
        double d = scan.nextDouble();
        // System.out.println("string");
        // Scanner string = new Scanner(System.in);
        scan.nextLine();
        String s = scan.nextLine();
        scan.close();
        // string.close();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

    }
}