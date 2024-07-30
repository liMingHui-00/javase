package day7;

import java.util.Scanner;

public class D8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入年份：");
        int year = scanner.nextInt();
        System.out.print("请输入月份：");
        int month = scanner.nextInt();
        System.out.print("请输入日期：");
        int day = scanner.nextInt();
        // 判断是否是闰年
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        // 计算这一天是这一年的第几天
        int dayOfYear = 0;
        for (int i = 1; i < month; i++) {
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    dayOfYear += 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    dayOfYear += 30;
                    break;
                case 2:
                    dayOfYear += isLeapYear ? 29 : 28;
                    break;
            }
        }
        dayOfYear += day;
        System.out.println("这一天是这一年的第 " + dayOfYear + " 天。");
    }
}
