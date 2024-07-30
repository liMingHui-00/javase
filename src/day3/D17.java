package day3;

import java.util.Scanner;

public class D17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数：");
        double num = scanner.nextDouble();
        if (100>num&&num>1) {
            System.out.println(num+"是1--100的数字");
        }else {
            System.out.println(num+"不是1--100的数字");
        }
    }
}
