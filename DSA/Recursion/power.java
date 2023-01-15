package Recursion;

public class power {
    // first methodf
    static int pow1(int p, int q) {
        if (q == 0) return 1;
        return pow1(p, q-1)*p;
    }
    
    // second method

    static int pow(int p,int q) { 
        if (q == 0) return 1;
        int sP = pow(p, q/2);
        if (q%2 == 0) { // if even
            return sP * sP;
        } else { // if odd
            // int sP = pow(p, q/2);
            return sP * sP *p;
        }
    }

    public static void main(String[] args) {
        System.out.println(pow(2, 10)); // using first method
        System.out.println(pow1(2, 10)); // using second method
    }
}