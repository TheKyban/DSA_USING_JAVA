package OOPs.Methods;

import java.util.Scanner;

public class Q2 {
    //  function for count Vowels
    public static int vowelCounter(String s) {
        int vowels[] = {65,69,73,79,85};
        char str[] = s.toUpperCase().toCharArray();
        int count = 0; 
        for (int i=0; i<s.length(); i++) {
            int num = (int) str[i];
            for (int j=0; j<vowels.length; j++) {
                if (vowels[j] == num) {
                    count+=1;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); sc.close();
        System.out.println(vowelCounter(s));
    }
}
