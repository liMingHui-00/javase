package day27;

import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public class D7 {
    public static void main(String[] args) {
        UnaryOperator<Integer> unaryOperator = (a)->a+2;
        System.out.println(unaryOperator.apply(2));
        BiFunction<Integer,Integer,Integer> biFunction =(a,b)->a+b;
        System.out.println(biFunction.apply(1, 1));
    }
}
