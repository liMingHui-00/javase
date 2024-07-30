package day19.work;

import java.util.Scanner;

public class D4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串");
        String s = scanner.next();
        char[] chars = s.toCharArray();
        if (chars[0] != chars[chars.length - 1]) {
            char temp = chars[0];
            chars[0] = chars[chars.length - 1];
            chars[chars.length - 1] = temp;
        }
        for (int i = 0; i < chars.length; i++) {
            if (i % 2 == 0) {
                chars[i] = '~';
            }
        }
        System.out.println("最终显示的效果");
        for (char c : chars) {
            System.out.print(c);}
    }
}




