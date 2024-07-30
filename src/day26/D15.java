package day26;

import java.util.*;

public class D15 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("sz","al");
        map.put("zd","ln");
        map.put("t","pk");
        Set<String> keys = map.keySet();
        for (String key :keys){
            System.out.println(key+" "+map.get(key));
        }
        System.out.println("---------");
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next+" "+map.get(next));
        }
        System.out.println("---------");
        Set<Map.Entry<String, String>> ens = map.entrySet();
        for (Map.Entry<String, String> me:ens){
            System.out.println(me.getKey()+" "+me.getValue());
        }
        System.out.println("--------------");
        Iterator<Map.Entry<String, String>> iterator2 = ens.iterator();
        while (iterator2.hasNext()){
            Map.Entry<String, String> next = iterator2.next();
            System.out.println(next.getKey()+" "+next.getValue());
        }
        System.out.println("----------");
        Collection<String> values = map.values();
        for (String s :values){
            System.out.println(s);
        }
        System.out.println("------------");
        Iterator<String> iterator1 = values.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
    }
}
