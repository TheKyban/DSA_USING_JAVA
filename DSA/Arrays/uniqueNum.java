package DSA.Arrays;

public class uniqueNum {
    static int findUnique(int[] arr) {
        int n = arr.length;
        
        int [] newArr = arr.clone();
        for (int i=0; i<n; i++) {
        
            for (int j=i+1; j<n; j++) {
                if (arr[i] == arr[j]) {
                    newArr[i] = newArr[j] = -1;
                }
            }
        }
        for (int i=0; i<n; i++) {
            if (newArr[i]>0) {
                return newArr[i];
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int [] arr = {21,7,3,3,21,5,7,5};
        System.out.println(findUnique(arr));
    }
}
