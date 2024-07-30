package day9;

import java.util.Random;

/**
 * @Author：lmh
 * @Create: 2024-7-9 16:05
 */
public class D8 {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int yzm = random.nextInt(9000)+1000;
            System.out.println(yzm);
        }
    }
}
