package day26;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class D1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(100));
        }
        System.out.println(list);
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        System.out.println(list);
        list.sort((n2,n1)->n1-n2);
        System.out.println(list);
    }
}
