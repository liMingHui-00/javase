package day5.am;

import java.util.Random;

public class D11 {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {

            System.out.println(random.nextInt(80));
        }
    }
}
