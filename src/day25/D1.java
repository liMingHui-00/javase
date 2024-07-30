package day25;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class D1 {
    public static void main(String[] args) {
        List list = new ArrayList(1);
        System.out.println(list.size());
//        System.out.println(list.isEmpty());
        list.add(1);
        list.add("李四");
//        list.add("李四");
//        System.out.println(list.contains("李四"));
        list.remove("李四");
        System.out.println("李四"+list.contains("李四"));
        list.remove(0);
        System.out.println(list.contains(1));
        list.add("王五");
        list.clear();
        System.out.println(list.size());
        list.add("麻子");
        System.out.println("麻子"+list.size());
        list.removeAll(list);
        System.out.println(list.size());
        list.add("麻子");
        list.add("王五");
        int index = list.indexOf("王五");
        System.out.println("王五"+index);
        System.out.println(list.get(0));
        list.removeAll(list);

//  add()  addAll()  remove() removeAll()  indexOf()  lastIndexOf()  clear()  get()  contains()  containsAll()
//iterator()  isEmpty()  size()  toArray()
        list.add("lisi");
        list.add(23)  ;
        System.out.println(list);
        list.add(0,"0");
        System.out.println(list);
        list.addAll(0,list);
        System.out.println(list);
        System.out.println(list.indexOf("0"));
        list.set(0,110);
        System.out.println(list);
        List subList = list.subList(1, list.size() - 1);
        System.out.println(subList);
        boolean remove = subList.removeAll(subList);
        System.out.println(remove);
        System.out.println("subList"+subList);
        subList.addAll(list);
        System.out.println(subList);
        System.out.println(list.containsAll(subList));
        subList.remove(new  Integer(110));
        System.out.println(subList);
        subList.removeAll(subList);
        System.out.println(subList.size());
        System.out.println(list.size());
        System.out.println(list);
        System.out.println("---------------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("============");
        for (Object l :list){
            System.out.println(l);
        }
        System.out.println("************");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
