package day26;

import java.util.Iterator;
import java.util.TreeSet;

public class D7 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("wangwu");
        treeSet.add("李四");
        treeSet.add("11");
        Iterator<String> iterator = treeSet.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
