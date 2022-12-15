package Patterns_Questions;

public class seventh {
    public static void main(String[] args) {
        int num=4;
        int star=1;
        for (int i=num; i>=1; i--)
        {
            for (int j=1; j<=2*(i-1);j++)
            {
                System.out.print(" ");
            }
            for (int j=1; j<=num-i+1; j++)
            {
                System.out.print(star+ "  ");
                star++;
            }
            System.out.println();
        }
    }
}
