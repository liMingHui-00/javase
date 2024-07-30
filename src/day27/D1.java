package day27;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class D1 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(11,"李四");
        linkedHashMap.put(13,"王五");
        linkedHashMap.put(17,"张三");
//        System.out.println(linkedHashMap.get(17));
        System.out.println(linkedHashMap);
        Set<Map.Entry<Integer, String>> entries = linkedHashMap.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
