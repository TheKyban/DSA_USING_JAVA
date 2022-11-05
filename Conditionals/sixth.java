package Conditionals;

import java.util.Scanner;

public class sixth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt(); sc.close();
//        String grade
        if (marks>90 && marks<=100) {
//            grade = "A+";
            System.out.println("Your grade is A+");
        } else if ( marks > 80 && marks<= 90) {
//            grade = 'A';
            System.out.println("Your grade is A");
        } else if (marks > 70 && marks <= 80) {
//            grade = 'B+';
            System.out.println("Your grade is B+");
        } else if (marks > 60 && marks <= 70) {
//            grade = 'B';
            System.out.println("Your grade is B");
        } else if (marks > 50 && marks<=60) {
//            grade = 'C';
            System.out.println("Your grade is C");
        } else if (marks > 40 && marks <= 50) {
//            grade = 'D';
            System.out.println("Your grade is D");
        } else if (marks >= 30 && marks <= 40) {
//            grade = 'E';
            System.out.println("Your grade is E");
        } else if (marks > 0 && marks < 30) {
//            grade = 'F';
            System.out.println("Your grade is F");
        }
    }
}
