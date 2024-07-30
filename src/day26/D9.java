package day26;

import java.util.TreeSet;

public class D9 {
    public static void main(String[] args) {
        D8 p1 = new D8("自来也", 28, 3000);
        D8 p2 = new D8("水门", 18, 3600);
        D8 p3 = new D8("纲手", 28, 4000);
        D8 p4 = new D8("大蛇丸", 29, 3800);
        TreeSet<D8> set = new TreeSet<>();
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        System.out.println(set);
    }
}
