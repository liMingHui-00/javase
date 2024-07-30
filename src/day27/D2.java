package day27;

import java.util.Set;
import java.util.TreeMap;

public class D2 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(5,"lisi");
        treeMap.put(2,"wang");
        treeMap.put(1,"snagging");
        System.out.println(treeMap);
        Set<Integer> keySet = treeMap.keySet();
        for (Integer integer : keySet) {
            System.out.println(integer+" "+treeMap.get(integer));
        }
    }
}
