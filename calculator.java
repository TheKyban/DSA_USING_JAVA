import java.util.Scanner;

public class calculator {
    // private Scanner c = new Scanner(System.in);
    static void calculateNum(float num1, float num2 , char operator) {
        if (operator == '+') {
            float sum1 = num1 + num2;
            System.out.println(sum1);
            // return sum ;
        }
        else if (operator == '-') {
            float sum1 = num1 - num2;
            System.out.println(sum1);            // return sum;
        }
        else if (operator == '*') {
            float sum1 = num1 * num2;
            System.out.println(sum1);
            // return sum;
        }
        else if (operator == '/') {
            float sum1 = num1 / num2;
            System.out.println(sum1);
            // return sum ;
        }
        else if (operator == '%') {
            float sum1 = num1 % num2;
            System.out.println(sum1);
            // return sum ;
        }
        // else if (operator == 'Q'){
        //     break;
        // }    
        // return float sum;
        
    }
    public static void main(String[] args) {
        // Function
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num1: ");
        float num1 = sc.nextFloat();


        System.out.println("Enter +, -, *, /, %, Q(Quit): ");
        char operator = sc.next().charAt(0);

                // sc.nextFloat();
        System.out.println("Enter Num2: ");
        float Num2 = sc.nextFloat();
        sc.close();
                
        calculateNum(num1, Num2, operator);
    }
}
