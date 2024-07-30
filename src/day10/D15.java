package day10;

import java.util.Random;

/**
 * @Author：lmh
 * @Create: 2024-7-10 19:19
 */
public class D15 {
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
        int max = a[0][0];
        int i2=0;
        int i3 = 0;
        for (int i = 0; i < a.length; i++) {
            for (int i1 = 0; i1 < a[i].length; i1++) {
                if (max< a[i][i1] ){
                    max =  a[i][i1];
                    i2 = i;
                    i3 = i1;
                }

            }
        }
        System.out.println("最大值是"+max+"下标是["+i2+"]["+i3+"]");
    }
}
