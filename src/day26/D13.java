package day26;

import java.util.ArrayList;
import java.util.Collections;

public class D13 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,5,6,7,9,4);
        System.out.println(list);
        Collections.replaceAll(list,1,5);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
    }
}
