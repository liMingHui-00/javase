package day26;

import day25.work.Worker;

import java.util.ArrayList;
import java.util.Comparator;

public class D2 {
    public static void main(String[] args) {
        Worker w1 = new Worker("lisi",18,300);
        Worker w2 = new Worker("zhaosna",58,3600);
        Worker w3 = new Worker("wangwu",28,1300);
        Worker w4 = new Worker("mazi",28,500);
        ArrayList<Worker> list = new ArrayList<>();
        list.add(w1);
        list.add(w2);
        list.add(w3);
        list.add(w4);
        System.out.println(list);
        list.sort(new Comparator<Worker>() {
            @Override
            public int compare(Worker o1, Worker o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        System.out.println(list);
        list.sort(new Comparator<Worker>() {
            @Override
            public int compare(Worker o1, Worker o2) {

                return o1.getAge()-o2.getAge()!=0?o1.getAge()-o2.getAge():o1.getSalary()-o2.getSalary();
            }
        });
        System.out.println(list);
        list.sort(((o1, o2) -> o1.getSalary()- o2.getSalary()));
        System.out.println(list);
    }
}
