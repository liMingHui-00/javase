package day10;

import java.util.Random;

/**
 * @Author：lmh
 * @Create: 2024-7-10 19:26
 */
public class D16 {
    public static void main(String[] args) {
        int a[][] = new int[3][5];
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int i1 = 0; i1 < a[i].length; i1++) {
                a[i][i1] = random.nextInt(41)+30;
                System.out.print(a[i][i1] +" ");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i1 = 0; i1 < a[1].length; i1++) {
           sum+= a[1][i1];

        }
        System.out.print("第二行平均值为"+sum/a[1].length);
    }
}
