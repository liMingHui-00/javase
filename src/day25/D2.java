package day25;

import java.util.ArrayList;
import java.util.List;

public class D2 {
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            Integer n = (Integer) list.get(i);
            sum += n;
        }
        System.out.println(sum);

        for (Object i : list) {
            Integer n = (Integer) i;
            sum += n;
        }
        System.out.println(sum);
    }
}
