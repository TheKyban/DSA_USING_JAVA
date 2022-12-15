package OOPs.Assignment;

public class Student {
    int Roll_name;
    String Name;
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.Name = "Aditya";
        student1.Roll_name = 1;
        System.out.print(student1.Name+" " + student1.Roll_name);
    }
}