package day28;

import java.util.TreeMap;

public class D7 {
    public static void main(String[] args) {
        String s = "qwertyuasrwqeqwreqwhjkgdqwghs";
        TreeMap<Character, Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (treeMap.containsKey(c)){
                Integer count = treeMap.get(c);
                count++;
                treeMap.put(c,count);
            }else {
                treeMap.put(c,1);
            }
        }
        System.out.println(treeMap);
    }
}
