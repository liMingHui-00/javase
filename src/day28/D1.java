package day28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class D1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("1");
        Stream<String> stream1 = arrayList.stream();
        String a[] = {"1"};
        double b[] = {1.1};
        DoubleStream stream = Arrays.stream(b);
        Stream<String> stream2 = Arrays.stream(a);
//        HashMap<String, String> hashMap = new HashMap<>();
//        Arrays.stream(hashMap);
    }
}
