package day9;

import java.util.Scanner;

public class D23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个元素");
            a[i] = scanner.nextInt();
        }
        System.out.println("数组元素为：");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int min = a[0];
        int minIndex = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
                minIndex = i;
            }
        }
        System.out.println("最小值是 " + min + " 下标：" + minIndex);
        int max = a[0];
        int maxIndex = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                maxIndex = i;
            }
        }
        System.out.println("最大值是 " + max + " 下标：" + maxIndex);
    }
}
