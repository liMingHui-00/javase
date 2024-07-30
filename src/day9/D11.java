package day9;

import java.util.Scanner;

/**
 * @Author：lmh
 * @Create: 2024-7-9 17:08
 */
public class D11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[5];
        int s = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            s += a[i];
        }
        System.out.println(s);
        System.out.println(s / a.length);
    }
}
