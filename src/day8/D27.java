package day8;

import java.util.Arrays;

/**
 * @Author：lmh
 * @Create: 2024-7-8 21:42
 */
public class D27 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int t = a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
        for (int b : a) {
            System.out.println(b);
        }
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
