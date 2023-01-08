package Recursion;
class Math { // mathematics using recursion
    int GCD(int x,int y) { // HCF or GCD(Greatest Common Divisor) using Euclid's Algorithms
        if (y%x==0) return x;
        return GCD(y%x,x);
    }

    int fibonacci(int n) {
        throw new java.lang.UnsupportedOperationException("Not supported yet.");
    }

    // print Array's Elements using recursion
    void printArr(int[] arr ,int i) { // from i to end
        if (arr.length == i) return;
        System.out.println(arr[i]); 
        printArr(arr, i+1);
    }
    void printArr(int[] arr ,int i,int n) { // from i to n-1 
        if (arr.length == i || i == n) return;
        System.out.println(arr[i]); 
        printArr(arr, i+1,n);
    }

}
public class Master {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Math math = new Math();
        // System.out.println(math.GCD(5, 1)); // HCF
        math.printArr(arr, 0,2); // print elements of an array
    }
}
