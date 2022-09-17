import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Start");
        int a = scan.nextInt();
        System.out.println("End");
        int b = scan.nextInt();
        scan.close();
        for (int i = a; i<=b;i++){
            for (int j=1; j<=10; j++){
                int table = a*j;
                System.out.print(table + " ");
            }
            a++;
            System.out.println();
        }
    }
}
