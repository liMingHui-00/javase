package day4;

import java.util.Scanner;

public class D1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int num = scanner.nextInt();
        System.out.println((num%7==0 || num%10==7 || num/10==7) ?"过":"bu");
//        个位
//        num%10==7
//        十位数
//        num /10 == 7
//        7的倍数
//        num % 7 ==0

    }
}
