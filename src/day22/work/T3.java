package day22.work;

import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        System.out.println("请输入一个数");
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int g = s%10;
        int n = s/10%10;
        int b = s/100;
        if (Math.pow(g,3)+Math.pow(n,3)+Math.pow(b,3)==s){
            System.out.println("是水仙花");

        }else {
            System.out.println("不是水仙花");
        }

    }
}
