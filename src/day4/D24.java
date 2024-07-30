package day4;

import java.util.Scanner;

public class D24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个三位整数：");
        int number = scanner.nextInt();
        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int units = number % 10;
        if (hundreds > tens && tens > units) {
            System.out.println(number + " 是降序数。");
        } else {
            System.out.println(number + " 不是降序数。");
        }
    }
}
