package Recursion;

public class power {
    // first methodf
    static int pow1(int p, int q) {
        if (q == 0) return 1;
        return pow(p, q-1)*p;
    }
    
    // second method

    static int pow(int p,int q) {
        if (q == 0) return 1;
        if (q%2 == 0) {
            int sP = pow(p, q/2);
            return sP * sP;
        } else {
            int sP = pow(p, q/2);
            return sP * sP *p;
        }
    }

    public static void main(String[] args) {
        System.out.println(pow(2, 2)); // using first method
        System.out.println(pow1(2, 2)); // using second method
    }
}
