package day28;

import java.util.Arrays;
import java.util.List;

public class D2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("马云",
                "马化腾","马致远","黎元洪","马超","马的");
        list.stream().distinct().forEach(n-> System.out.println(n));
        long count = list.stream().skip(2).limit(2).count();
        System.out.println(count);
        list.stream().skip(2).limit(2).forEach(System.out::println);

    }
}
