package DSA.Arrays;

import java.util.ArrayList;
import java.util.List;

public class listInteger {
    static List<Integer> name(List<Integer> aa) {
        aa.add(1);
        aa.add(1);
        aa.add(10);
        int a = aa.get(2);
        int a1 = aa.get(0);
        aa.set(0, a);
        aa.set(2, a1);
        // aa.set(0, a)
        return aa;
    }
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        name(l1);

        System.out.println(l1.size());
    }
}
