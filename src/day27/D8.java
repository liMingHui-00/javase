package day27;

import java.util.function.Consumer;

public class D8 {
    public static void main(String[] args) {
        Consumer<String> consumer = System.out::println;
        consumer.accept("sd");
    }
}
