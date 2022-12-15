package Patterns_Questions;

public class sixth {
    public static void main(String[] args) {

        //     *
        //    *  *
        //  *  *  *
        // *  *  *  *
        int num =4;
        for (int i=num; i>=1; i--) {
            for (int j=1; j<=2*(i-1); j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=num-i+1; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }

        // Using while loop
        System.out.println("using while loop");
        int temp =num;
        while (temp>=1) {
            int i=1;
            int j=1;
            while (i<=2*(temp-1)) {
                System.out.print(" ");
                i++;
            }
            while (j<= num-temp+1) {
                System.out.print("*  ");
                j++;
            }
            System.out.println();
            temp--;
        }
    }
}
