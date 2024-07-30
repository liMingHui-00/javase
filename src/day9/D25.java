package day9;

import java.util.Random;

/**
 * @Author：lmh
 * @Create: 2024-7-9 19:11
 */
public class D25 {
    public static void main(String[] args) {
        Random random = new Random();
        int a[] =  new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i]= random.nextInt(20);
        }
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }
        int avg = sum/10;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (avg <= a[i]) {
                System.out.println(a[i]);
                count++;
            }
        }
        System.out.println("一共有"+count+"个数字大于平均数");
    }
}
