package day26;

import java.util.HashSet;
import java.util.Iterator;

public class D3 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("skw");
        set.add("zbj");
        HashSet<String> set1 = new HashSet<>();
        set1.add("ts");
        set1.addAll(set)    ;
//        System.out.println(set1);
//        System.out.println(set1.containsAll(set));
//        System.out.println("set1"+ set1);
//        System.out.println("set"+ set);
//        set1.removeAll(set);
//        System.out.println("set1"+set1);
        Iterator<String> iterator = set1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("-------------");
        for (String str :set1){
            System.out.println(str);
        }
    }
}
