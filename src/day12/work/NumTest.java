package day12.work;

import java.util.Scanner;

/**
 * @Author：lmh
 * @Create: 2024-7-12 19:50
 */
public class NumTest {
    public static void main(String[] args) {
        Num num = new Num();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个三位整数:");
        int n = scanner.nextInt();
        System.out.println(num.isSXH(n)?n+"是水仙花数":n+"不是水仙花数");
    }
}
