package day26;
import java.util.ArrayList;
import java.util.Collections;
public class D11 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,5,9,23,4,6,769);
        System.out.println(list);
        Collections.sort(list,(n1,n2)->n2-n1);
        System.out.println(list);
        int index = Collections.binarySearch(list,4);
        System.out.println(index);
        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
    }
}
