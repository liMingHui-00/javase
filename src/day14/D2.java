package day14;

import java.util.Scanner;

/**
 * @Author：lmh
 * @Create: 2024-7-14 15:46
 */
public class D2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串");
        String str  = scanner.next();
        String str2 = "a";
        System.out.println(str==str2);
        System.out.println(str.equals(str2));
    }
}
