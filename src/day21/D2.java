package day21;

import java.util.ArrayList;

public class D2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("xiong");
        list.add("tun");
        list.add("b");
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i==list.size()-1){
                System.out.print(list.get(i));
            }else {
                System.out.print(list.get(i)+",");
            }
        }
        System.out.println("]");
    }
}
