package day4;

import java.util.Scanner;

public class D18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a>b && a>c)
        {
            System.out.println("最大是"+a);
        }
        if (b>a && b>c){
            System.out.println("最大数是"+b);
        }
        if (c>a && c>b){
            System.out.println("最大数是"+c);
        }

    }
}
