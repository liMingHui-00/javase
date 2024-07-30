package day28;

import java.util.HashMap;

public class D5 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("刘备","接着做月结这屋");
        hashMap.put("曹操","绝对不可能");
        hashMap.put("那里多","巧夺麻油");
        hashMap.forEach((k,v)-> System.out.println(k+" : "+v));
    }
}
