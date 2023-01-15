import java.util.*;

class Student {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}

// Complete the code
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
        // Collections.sort(studentList)
        for (int i = 0; i < studentList.size() - 1; i++) {
            for (int j = i + 1; j < studentList.size(); j++) {
                Double a = studentList.get(i).getCgpa();
                Double b = studentList.get(j).getCgpa();
                if (a > b) {
                    Student hi = studentList.get(i);
                    Student lo = studentList.get(j);
                    studentList.set(i, lo);
                    studentList.set(j, hi);
                }
            }
        }
        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
        // studentList.set(0, studentList.get(1));
        // studentList.set(0, studentList.get(1));
        // System.out.println(studentList.get(0).getFname());
    }
}
