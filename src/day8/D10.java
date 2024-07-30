package day8;

import java.util.Scanner;

/**
 * @Author：lmh
 * @Create: 2024-7-8 15:05
 */
public class D10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr []  =new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第"+(i+1)+"个数据");
            arr[i] =scanner.nextInt();
        }
        int sum = 0;
        for (int a : arr) {
            sum+=a;
        }
        System.out.println("总和：" + sum);
        System.out.println("平均值：" + sum / 5.0);
    }
}
