package day9;

import java.util.Random;

/**
 * @Author：lmh
 * @Create: 2024-7-9 19:24
 */
public class D28 {
    public static void main(String[] args) {
        Random random = new Random();
        int a[] = new int[5];
        for (int i = 0; i < 5; i++) {
            int num =random.nextInt(26)+5;
            a[i] = num;
        }
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (max<=a[i]){
                max=a[i];
            }
        }
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min>=a[i]){
                min=a[i];
            }
        }
        System.out.println("总和为" + sum + "平均数为" + sum / a.length + "最大值为：" + max + "最小值为：" + min);
    }
}
