package Some_Questions;

import java.util.Scanner;

public class sumOfSeries {
    public static void main(String[] args) {
        // S=1-2+3-4+5-6+7...n
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum = 0; sc.close();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum -= i;
            } else {
                sum +=i;
            }
        }
        System.out.println(sum);
    }
}
