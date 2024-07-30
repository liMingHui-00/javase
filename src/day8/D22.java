package day8;

import java.util.Scanner;

/**
 * @Author：lmh
 * @Create: 2024-7-8 18:39
 */
public class D22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int num = scanner.nextInt();
        int temp = num;
        int count = 0;
        while (true) {
            temp = temp / 10;
            count++;
            if (temp == 0) {
                break;
            }
        }
        System.out.println(num+"是个"+count+"位数");
    }
}
