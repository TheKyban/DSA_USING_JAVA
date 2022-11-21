package OOPs.Assignment;

public class Triangle {
    float a=3;
    float b=4;
    float c=5;
    float s = (a+b+c)/2;
    float area = (s*(s-a)*(s-b)*(s-c))/2;
    public static void main(String[] args) {
        Triangle tr = new Triangle();
        System.out.println(tr.area);
        System.out.println(tr.s);
    }
}
