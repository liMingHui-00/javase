package day19.work;

import java.util.Random;
import java.util.Scanner;

public class D5 {
    public static void main(String[] args) {
        Random random = new Random();
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String s1 = "";
        for (int i = 0; i < 4; i++) {
           s1+= s.charAt(random.nextInt(s.length()));
        }
        System.out.println(s1);
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入验证码");
        String s2 = scanner.next();
       if (s1.equalsIgnoreCase(s2)){
           System.out.println("验证成功");
       }else {
           System.out.println("验证码输入有误");
       }
    }
}
