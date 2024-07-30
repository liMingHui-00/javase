package day4;

import java.util.Scanner;

public class D17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int g = h % 10;
        int s = h/10%10;
        int b = h/100;
        if (g*g*g+s*s*s+b*b*b == h){
            System.out.println(h+"是水仙花数");
        }else {
            System.out.println("不是");
        }
    }
}
