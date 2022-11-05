package Some_Questions;

public class seriesproblem {
    public static void main(String[] args) {
        int n=4;
        for (int k=0;k<=n;k++){

            int cal_v=5;
            for (int i=0; i<=k; i++) {
                int sq=1;
                for (int j=1; j<=i; j++) {
                    sq *= 2;
                }
                cal_v += sq*3;
                // int cal_p = sq*3;
                // System.out.print(cal_p+" ");
            }
            System.out.print(cal_v + " ");
        }
    }
}
