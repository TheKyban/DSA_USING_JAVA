package Some_Questions;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); sc.close();
        String prime = "Prime Number";
        if (num==1) prime = "not Prime";
        for (int i=2; i<num; i++) {
            if (num%i==0) {
                prime = "not Prime number";
            }
        }
        System.out.println(prime);
    }
}
