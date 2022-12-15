package input;

import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int subject1 = sc.nextInt();
        int subject2 = sc.nextInt();
        int subject3 = sc.nextInt();
        sc.close();
        int total_marks = subject1+subject2+subject3;
        int total_percentage = (total_marks*100)/300 ;
        System.out.println("Total Marks: "+total_marks);
        System.out.println("Total Percentage "+ total_percentage+"%");
    }
}
