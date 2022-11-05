package Some_Questions;

public class seriesSum {
    public static void main(String[] args) {
        // 1/1 + 1/2 + 1/3.....1/n
        int n = 3;
        float result = 0;
        for (float i=1; i<=n; i++){
            result += 1/i;
        }
        System.out.println(result);
    }
}
