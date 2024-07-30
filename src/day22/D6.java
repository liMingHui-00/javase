package day22;

import java.util.Random;

public class D6 {
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt();
        System.out.println(i);
        boolean b = random.nextBoolean();
        System.out.println(b);
    }
}
