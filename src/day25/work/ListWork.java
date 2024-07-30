package day25.work;

import java.util.Iterator;
import java.util.LinkedList;

public class ListWork {
    public static void main(String[] args) {
        Worker w1 = new Worker("zhangsan",21,3000);
        Worker w2 = new Worker("lisi",25,3600);
        Worker w3 = new Worker("wangwu",22,3200);
        LinkedList<Worker> list = new LinkedList<>();
        list.add(w1);
        list.add(w2);
        list.add(w3);
        list.add(1,new Worker("zhaoliu",223,3300));
        list.remove(list.size()-1);
        Iterator<Worker> it = list.iterator();
        while (it.hasNext()){
            it.next().work();
        }
    }
}
