package day19.work;

import java.util.Scanner;

public class D2 {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串（只有字母数字）");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        int Count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c>='a'&&c<='z'){
                lowerCaseCount++;
            }
            if (c>='A'&&c<='Z'){
                upperCaseCount++;
            }
            if (c>='1'&&c<='9'){
                Count++;
            }
        }
        System.out.println("大写字母个数: " + upperCaseCount);
        System.out.println("小写字母个数: " + lowerCaseCount);
        System.out.println("数字个数: " + Count);
    }
}
