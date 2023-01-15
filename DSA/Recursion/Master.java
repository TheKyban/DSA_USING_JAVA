package Recursion;

import java.util.ArrayList;

class Math { // mathematics using recursion

    void print1ToN(int n) { // print 1 to n
        if (n == 0) return;
        print1ToN(n-1);
        System.out.print(n + " ");
    }
    void printNTo1(int n) { // print n to 1
        if (n == 0) return;
        System.out.print(n+" ");
        printNTo1(n-1);
    }

    int GCD(int x,int y) { // HCF or GCD(Greatest Common Divisor) using Euclid's Algorithms
        if (y%x==0) return x;
        return GCD(y%x,x);
    }

    int fibonacci(int n) { // 0 1 1 2 3 5 8
        if (n==1 || n==0) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    int factorial(int n) { // 120 = 5*4*3*2*1
        if (n==1 || n == 0) return 1;
        return n * factorial(n-1);
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

    int maxNumInArray(int[] arr) { // maximum Element in an array
        return maxNumI(arr,0);
    }
    int maxNumI(int[] arr, int i) { // maximum Element in an array
        if (i == arr.length-1) return arr[i];
        return (arr[i]>maxNumI(arr, i+1)) ? arr[i] : maxNumI(arr, i+1);
    }

    int sumOfElementsOfArray(int[] arr, int n) { // sum of All elements in an array
        if (n == arr.length-1) return arr[n];
        return arr[n]+sumOfElementsOfArray(arr, n+1);
    }

    int valueExistInArray(int[] arr, int i, int v) { // linear search in an array returns only index
        if (i >= arr.length) return -1;
        if (v == arr[i]) return i;
        return valueExistInArray(arr, i+1, v);
    }

    void valueExistInArrayAllIndices(int[] arr, int i, int v) { // prints all indices 
        if (i>=arr.length) return;
        if (v == arr[i]) System.out.print(i + " ");
        valueExistInArrayAllIndices(arr, i+1, v);
    }

    ArrayList<Integer> valueExistInArrayUsingArrayList(int[] arr, int i, int v) { // returns all indices in an arraylist
        if (i>= arr.length) return new ArrayList<>(); // returning empty arraylist
        ArrayList<Integer> li = new ArrayList<>();
        if (v==arr[i]) li.add(i);
        ArrayList<Integer> ans = valueExistInArrayUsingArrayList(arr, i+1, v);
        li.addAll(ans);
        return li;
    }

    int lastIndexOfTargetedValueInArray(int[] arr, int i , int v) {
        if (i==-1) return -1;
        if (v== arr[i]) return i;
        return lastIndexOfTargetedValueInArray(arr, i-1, v);
    }

    void table(int n, int k) { // print table from 1 to k
        if  (k == 0) return;
        table(n, k-1);
        System.out.print(n*k + " ");
    }

    int sumOfNaturalNumbers(int n) {
        if (n == 0) return 0;
        return n+sumOfNaturalNumbers(n-1);
    }

    int power(int n, int p) { // power of a number method 1
        if (p == 0) return 1;
        return n*power(n, p-1);
    }

    long pow(int n, int p) { // better time compexity of power method 2
        if (p == 0 ) return 1;
        long smallPow = pow(n, p/2);
        return (p%2==0) ? smallPow*smallPow : smallPow*smallPow*n;
    }

}
public class Master {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,5,2,1};
        Math math = new Math();
        // System.out.println(math.GCD(5, 1)); // HCF
        // math.printArr(arr, 0,2); // print elements of an array
        // int a = math.fibonacci(5);
        // System.out.println(a);
        // int a = math.factorial(5);
        //  System.out.println(a);
        // int a = math.sumOfElementsOfArray(arr, 0);
        // System.out.println(a);
        // math.table(10, 10);
        // System.out.println(math.sumOfNaturalNumbers(10));
        // System.out.println(math.power(2, 10));
        // System.out.println(math.pow(2, 2));
        // System.out.println(math.valueExistInArray(arr, 0, 1));
        // math.valueExistInArrayAllIndices(arr, 0, 5);
        // System.out.println(math.valueExistInArrayUsingArrayList(arr, 0, 5));
        // ArrayList<Integer> ans = math.valueExistInArrayUsingArrayList(arr, 0, 5);
        // System.out.println(ans.toString());
        System.out.println(math.lastIndexOfTargetedValueInArray(arr, arr.length-1, 5));
    }
}
