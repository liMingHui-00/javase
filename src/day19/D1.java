package day19;

import java.util.Scanner;

public class D1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("请输入一个字符串:");
//        String s = sc.next();
        String s ="abcd";
        if (s.charAt(0) != s.charAt(s.length()-1)){
            char firstS = s.charAt(0);
            System.out.println(firstS);
            char lastS = s.charAt(s.length()-1);
            System.out.println(lastS);
//            首尾互换
            String s1 = s.replace(firstS,lastS);
            System.out.println(s1);
//            String temp = s1
//            String s2 = s.replace(s.charAt(0),last);
//            String s3 = s2.replace(s.charAt(0),s2.charAt(s2.length()-1));
//            System.out.println(s3);
////            s = s.replace(s.charAt(s.length()-1),c);
        }
    }
}
