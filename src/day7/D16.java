package day7;

import java.util.Random;

/**
 * ClassName: D16
 * Package: day7
 * Description：
 *
 * @Author：lmh
 * @Create: 2024-7-7 16:07
 */
public class D16 {
    public static void main(String[] args) {
        int a[] = new int[10];

        for (int i = 0; i < a.length; i++) {
           a[i] =  new Random().nextInt(100)+1;
        }
       int s = 0;
        for (int i = 0; i < a.length; i++) {
            s+=a[i];
        }
     int avg = s/a.length;
        int cou = 0;
        for (int i = 0; i < a.length; i++) {
            if (avg > a[i]) {
                cou ++;
            }
        }
        System.out.println(cou);
    }
}
