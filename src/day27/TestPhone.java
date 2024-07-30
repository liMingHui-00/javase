package day27;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestPhone {
    public static void main(String[] args) {
        ArrayList<Person> arrayList = new ArrayList<>();
        Person p1 = new Person("lisi", "110");
        Person p2 = new Person("tom", "120");
       arrayList.add(p1);
       arrayList.add(p2);
        ArrayList<Person> arrayList2 = new ArrayList<>();
        Person p3 = new Person("李四", "110");
        Person p4 = new Person("王五", "120");
        arrayList2.add(p4);
        arrayList2.add(p3);
        HashMap<String,ArrayList<Person>> hashMap = new HashMap<>();
        hashMap.put("A",arrayList);
        hashMap.put("B",arrayList2);
        Set<Map.Entry<String, ArrayList<Person>>> entries = hashMap.entrySet();
        for (Map.Entry<String, ArrayList<Person>> entry : entries) {
            String key = entry.getKey();
            System.out.println(key);
            ArrayList<Person> value = entry.getValue();
            for (Person person : value) {
                System.out.println("\t"+person);
            }
        }
    }
}
