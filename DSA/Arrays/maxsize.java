package DSA.Arrays;
import java.util.Scanner;

public class maxsize {
    static int MaxSize(int[] arr) {
        int sum =0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i]==0){
                sum--;
            } else {
                sum++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out. println("Enter the length: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        int sum = 0;
        int maxsize = -1; //initialize from -1 because incase no subarray found, we are still printing maxsize in
        // the end which will then be -1 only
        for (int i = 0; i < n - 1; i++) {
            sum = (arr[i] == 0) ? -1 : 1; //-1 indicates presence of 0 and 1 indicates presence of 1 so when equal
        // number of 0 and 1 are present, sum = 0
            for (int j = i + 1; j < n; j++) {
                if (arr[j] == 0) sum += -1;
                else sum += 1;
                if (sum == 0 && maxsize < j - i + 1) {
                    maxsize = j - i + 1;
                }
            }
        }
        System.out.println(maxsize);
        
    }
}
