package day26;

import java.util.HashMap;

public class D14 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("sz","al");
        map.put("zd","ln");
        map.put("t","pk");
        System.out.println(map.size());
        System.out.println(map);
        System.out.println(map.get("t"));
        map.remove("sz");
        System.out.println(map);
        System.out.println(map.containsKey("t"));
        System.out.println(map.containsValue("pk"));
        map.clear();
        System.out.println(map);
    }
}
