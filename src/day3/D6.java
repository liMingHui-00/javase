package day3;

import java.util.Scanner;

public class D6 {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        Scanner sc =    new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        int max = num1>num2?num1:num2;
        System.out.println("最大是"+max);
    }
}
