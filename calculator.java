import java.util.Scanner;

public class calculator {
    static float calculateNum(float num1, float num2 , char operator) {
        float calNum = 0;
       switch (operator) {
            case '+': 
                calNum += num1+num2;
                break;
            case '-': 
                calNum += num1-num2;
                break;
            case '*': 
                calNum += num1*num2;
                break;
            case '/': 
                calNum += num1/num2;
                break;
            case '%': 
                calNum += num1%num2;
                break;
        }
        return calNum;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num1: ");
        float num1 = sc.nextFloat();


        System.out.println("Enter +, -, *, /, %, Q(Quit): ");
        char operator = sc.next().charAt(0);

        System.out.println("Enter Num2: ");
        float Num2 = sc.nextFloat();
        sc.close();
                
        System.out.println(calculateNum(num1, Num2, operator)); 
    }
}
