package day26;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class D6 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(6);
        linkedHashSet.add(1);
        linkedHashSet.add(8);
        System.out.println(linkedHashSet);
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(3);
        hashSet.add(1);
        hashSet.add(4);
        hashSet.add(2);
        System.out.println(hashSet);
    }
}
