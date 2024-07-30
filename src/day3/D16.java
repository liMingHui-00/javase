package day3;

import java.util.Scanner;

public class D16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int num = scanner.nextInt();
        System.out.println(num+"的个位数是"+(num%10)+"十位数是"+((num-num%10)/10%10)+"百位数是"+(num/100));
        double  a = 88.9;


    }
}
