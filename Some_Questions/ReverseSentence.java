package Some_Questions;

import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine(); sc.close();
        int i = sentence.length()-1;
        String ans = "";        

        while (i>=0) {
            while (i>=0 && sentence.charAt(i)==' ') i-- ;
            int j = i;
            while (i>=0 && sentence.charAt(i)!=' ') i-- ;
            if (ans.isEmpty()) {
                ans = ans.concat(sentence.substring(i+1, j+1));
            } else {
                ans = ans.concat(" "+sentence.substring(i+1, j+1));
            }
        }
        System.out.println(ans);
    }
}
