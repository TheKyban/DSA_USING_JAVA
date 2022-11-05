package Patterns_Questions;

public class forth {
    public static void main(String[] args) {
        int num=4;
        for (int i=1; i<=num; i++) {
            for (int j=1; j<=2*(i-1); j++) {
                System.out.print(" ");
            }
            for (int j=1; j<= num-i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        int temp = 1;
        // Using While Loop
        System.out.println("using while loop");
        while (temp<=num) {
            int i=1;
            int j=1;
            while (i<=2*(temp-1)) {
                System.out.print(" ");
                i++;
            }
            while (j<=num-temp+1) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            temp++;
        }
    }
}
