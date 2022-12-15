package OOPs.Methods;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(); sc.close();
        System.out.println(printMiddlePart(s));
    }
    
    // Function for PrintMiddlePart
    public static String printMiddlePart(String s) {
    char arr[] = s.toCharArray();        
    String str = "";
    int sL = s.length();
    double a = (sL/2);
    if (sL%2!=0) {
        str+=arr[(int) Math.floor(a)];
    } else {
            str+=arr[(int) Math.floor(a-1)];
            str+=arr[(int) Math.floor(a)];
        }
        return str;
    }
}
