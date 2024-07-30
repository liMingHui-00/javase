package day4;

import java.util.Scanner;

public class D25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n>0){
            System.out.println("输入的是正数");
        }
        if (n<0){
            System.out.println("输入的是负数");
        }
        if (n==0){
            System.out.println("输入的是0");
        }

    }
}
