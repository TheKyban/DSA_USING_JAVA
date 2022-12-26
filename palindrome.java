import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int l = S.length();
        int i=0,j=l-1;
        boolean ans = false;
        if (l%2 != 0) {
            while(i<j) {
                if (S.charAt(i) == S.charAt(j)) {
                    i++;
                    j--;
                    ans = true;
                } else {
                    ans = false;
                    break;
                }
            }
        }
        System.out.println(ans);sc.close();
    }
}
