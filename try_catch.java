import java.util.*;

public class try_catch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a/b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println(e.getClass());
        } catch (InputMismatchException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        } sc.close();
    }
}