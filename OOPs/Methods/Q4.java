package OOPs.Methods;

import java.util.Scanner;

public class Q4 {
    public static String LeapYear(int year) {
        String str = "";
        if (year%400 == 0) {
            str+="leap Year";
        } else if (year%4==0 && year%100!=0) {
            str+= "leap Year" ;
        } else {
            str+="Not leap year" ;
        }
        return str;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt(); sc.close();
        System.out.println(LeapYear(year));
    }
}
