package day22.work;

import java.util.Date;
import java.util.Scanner;

public class T6 {
    public static void main(String[] args) {
//        从控制台输入你出生的年月日，计算并打印你的年龄 及 出生到现在的天数  和 计算出生日期是当年的第几天！
        System.out.println("请输入你的出生年份");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        System.out.println("请输入你的出生月份");
        int month = scanner.nextInt();
        System.out.println("请输入你的出生日期");
        int day  = scanner.nextInt();
        Date date = new Date();
//        System.out.println("你的年龄为："+(date.getYear()+1900-year));
        long now = date.getTime();
        Date date2 = new Date();
        System.out.println(now);
    }
}
