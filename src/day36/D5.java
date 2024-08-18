package day36;

import java.util.*;

public class D5 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(); ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            sb.append(i);String s = sb.toString();strings.add(s);
        }
        sb.append("q").append("b").append(5).append("w").append("s").append("a").append("p");



        System.out.println(strings);
        Collections.shuffle(strings,new Random());
        System.out.println(strings);
    }

}
