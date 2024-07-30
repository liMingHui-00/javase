package day23.test;

import java.math.BigInteger;

public class D8 {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("100");
        BigInteger bigInteger2 = new BigInteger("23");
        System.out.println(bigInteger.add(bigInteger2));
        System.out.println(bigInteger.subtract(bigInteger2));
        System.out.println(bigInteger.multiply(bigInteger2));
        System.out.println(bigInteger.divide(bigInteger2));
    }
}
