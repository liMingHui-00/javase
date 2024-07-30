package day25;

import java.util.LinkedList;
import java.util.List;

public class D6 {
    public static void main(String[] args) {
        List<String> list = new LinkedList();
        list.add("孙悟空");
        list.add(1,"猪八戒");
        System.out.println(list);
        list.addAll(list);
        list.remove(2);
        System.out.println(list);
        list.set(2,"沙和尚");
        System.out.println(list);
        System.out.println(list.contains("唐僧"));
        list.clear();
        System.out.println(list);
        System.out.println(list);


    }
}
