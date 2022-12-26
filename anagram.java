import java.util.Scanner;

public class anagram {
    static char[] sortStr(String a) {
        a = a.toLowerCase();
        char arr[] = a.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((int) arr[i] > (int) arr[j]) {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    static boolean isAnagram(String a, String b) {
        // Complete the function
        char[] str1 = sortStr(a);
        char[] str2 = sortStr(b);
        boolean ans = false;
        for (int i=0; i<a.length(); i++) {
            if (str1[i] == str2[i]) {
                ans = true;
            } else {
                ans = false;
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}