package day27;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class D5 {
    public static void main(String[] args) {
        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("qwe");
        Supplier<Integer> supplier = ()-> 7;
        System.out.println(supplier.get());
    }
}
