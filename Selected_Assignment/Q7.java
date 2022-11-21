package Selected_Assignment;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        //ArmStrong Number
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); sc.close();
        for (int i=1; i<= num; i++) {
            int sum = 0;
            int temp = i;
            while (temp>0) {
                int lastDigit = temp%10;
                sum+=Cube(lastDigit);
                temp/=10;
            }
            if (i==1) {
                System.out.print("The ArmStrong Number is: ");
            }
            if (sum == i) {
                System.out.print(sum+" ");
            }
        }
    }
    public static int Cube(int num) {
        return num*num*num;
    }
}
