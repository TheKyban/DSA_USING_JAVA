package Array.harryAssignment;

class CalSum{
    public float Average (int[] arr) {
        int num = arr.length;
        int sum = 0; 
        for (int i : arr) {
            sum+=i;
        }
        return sum/num;
    }
}
public class Q3 {
    public static void main(String[] args) {
        int [] arr = {60, 70,80,100, 90} ;
        CalSum obj = new CalSum();
        System.out.println(obj.Average(arr));
    }
}
