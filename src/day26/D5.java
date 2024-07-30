package day26;

import java.util.HashSet;

public class D5 {
    public static void main(String[] args) {
        D4 p1 = new D4("lisi", 23);
        D4 p2 = new D4("wangwu", 24);
        D4 p3 = new D4("wangwu", 24);
        D4 p4 = new D4("wangwu", 24);
        HashSet<D4> set = new HashSet<>();
        set.add(p1);
        set.add(p3);
        set.add(p2);
        set.add(p4);
        System.out.println(set);
//        Object clone = set.clone();//深拷贝，两个不同的对象
//        System.out.println(clone.equals(set));
    }
}
