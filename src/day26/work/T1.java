package day26.work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class T1 {
    public static void main(String[] args) {
        List<String> hs = new ArrayList<>();
        hs.add("♦");hs.add("♣");hs.add("♠");hs.add("♥");
        List<String> sz = new ArrayList<>();
        List<String> pk = new ArrayList<>();
        for (int i = 1; i < 11; i++) {sz.add(i+"");}
        sz.add("J");sz.add("Q");sz.add("K");
        for (String s1 :hs){
            for (String s2 :sz){
                pk.add(s1+s2);
            }
        }
        pk.add("🃏");pk.add("🤡");
//        洗牌
        Collections.shuffle(pk);
        System.out.println(pk);
        ArrayList<String> p1 = new ArrayList<>();
        ArrayList<String> p2 = new ArrayList<>();
        ArrayList<String> p3 = new ArrayList<>();
        ArrayList<String> dp = new ArrayList<>();
//        第一个人的牌
       p1.addAll(pk.subList(0,17));
        //        第二个人的牌
        p2.addAll(pk.subList(17,34));
        //        第三个人的牌
        p3.addAll(pk.subList(34,51));
//       底牌
        dp.addAll(pk.subList(51,54));
    }
}
