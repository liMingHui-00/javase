package day28;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class D4 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("艾伦","进击的巨人");
        hashMap.put("莱纳","凯子巨人");
        hashMap.put("皮克","车立巨人");
        Set<Map.Entry<String, String>> entries = hashMap.entrySet();
//        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
//        while (iterator.hasNext()){
//            Map.Entry<String, String> entry = iterator.next();
//            System.out.println(entry.getKey()+": "+entry.getValue());
//        }
//        for (Map.Entry<String, String> entry : entries) {
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }
//        entries.forEach(n-> System.out.println(n.getKey()+" : "+n.getValue()));
        hashMap.forEach((k,v)-> System.out.println(k+": "+v));
    }
}
