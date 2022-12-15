package Patterns_Questions;

public class fifth {
    public static void main(String[] args) {
        int num=4;
        for (int i=1; i<=num; i++) {
            for (int j=1; j<=num; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }

        // using while loop
        System.out.println("using while loop");
        int temp =1;
        while (temp<=num) {
            int i=1;
            while (i<=num) {
                System.out.print("*  ");
                i++;
            }
            System.out.println();
            temp++;
        }
    }
}
