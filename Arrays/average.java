package Arrays;

import java.util.Scanner;

public class average {
    // function for average
    static float averagefunc(int list[], int lenOfNum){
        int sum = 0;
        for (int i=0; i<lenOfNum; i++) {
            sum += list[i];
        }
        float ave = (float)sum/ (float)lenOfNum;
        return ave;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lenOfNum = sc.nextInt();
        int list[] = new int[lenOfNum];
        for (int i=0; i<lenOfNum; i++){
            list[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(averagefunc(list, lenOfNum));
    }
}
