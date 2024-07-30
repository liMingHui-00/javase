package day23.test;
import java.math.BigDecimal;
public class D9 {
    public static void main(String[] args) {
        System.out.println(2.0-1.0);
        BigDecimal b1 = new BigDecimal(10);
        BigDecimal b2 = new BigDecimal(3.3);
        System.out.println(b1.subtract(b2));
        System.out.println(b1.add(b2));
        System.out.println(b1.multiply(b2));
//        System.out.println(b1.divide(b2));
        System.out.println(b1.divide(b2, 6, BigDecimal.ROUND_HALF_UP));
    }
}
