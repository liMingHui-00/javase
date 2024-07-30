package day6;

import java.util.Scanner;

public class D5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 1; i <= a; i++) {
            if (i * i == a) {
                System.out.println(i+"是"+a+"的平方根");
                break;
            } else if (i*i>a) {
                System.out.println((i-1)+"是"+a+"的平方根的整数部分");
                break;
            }

        }
    }
}
