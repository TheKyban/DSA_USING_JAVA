package Arrays;

public class sorting {
    // using bubble sort method
    public static void main(String[] args) {
        int a[] = {3,4,10,1,5,11};
        for (int i=0; i<a.length-1; i++){
            for (int j=0; j<a.length-1; j++) {
                if (a[j+1]<a[j]) {
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int item:a) {
            System.out.print(item + " ");
        }
            
    }
}
