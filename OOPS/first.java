package OOPS;

public class first {
       
    public static void main(String[] args) {
        String name1 = "Aditya";
        Greet gm = new Greet(name1) ;
        System.out.println(gm);
    }
}
class Greet {
    Greet(String name) {
        System.out.println("Hello " + name);
    }
}