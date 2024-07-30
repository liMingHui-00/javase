package day25;

import java.util.LinkedList;

public class D7 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("swk");
        list.addLast("tjf");
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        list.offerFirst("bm");
        System.out.println(list);
        list.offerLast("swf");
        System.out.println(list);
        System.out.println(list.pollFirst());
        list.removeFirst();
        System.out.println(list);
    }
}
