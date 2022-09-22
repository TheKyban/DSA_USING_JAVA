package Arrays;

public class sorting2 {
    //using selecting sorting method
    public static void main(String[] args) {
        int a[] = {2,5,3,5,1,4};
        int n = a.length;
        for (int i=0; i<n-1; i++){
            int minIndex = i;
            for (int j=0; j<n; j++){
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }
        for (int item:a){
            System.out.print(item+ " ");
        }
    }
}
