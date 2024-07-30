package day7;

import java.util.Scanner;

/**
 * ClassName: D7
 * Package: day7
 * Description：
 *
 * @Author：lmh
 * @Create: 2024-7-7 12:06
 */
public class D7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year  = scanner.nextInt();
        System.out.println("请输入月份：");
        int month = scanner.nextInt();
        System.out.println("请输入日期：");
        int day = scanner.nextInt();
//        定义每个月份的天数
            int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
//        判断是否是闰年
        if (year%400==0||year%4==0&&year%100!=0) {
            daysInMonth[1]= 29;
        }
        int totalDay = 0;
        for (int i = 0; i < month - 1; i++) {
            totalDay=totalDay+daysInMonth[i];
        }
//        加上当前月份的天数
        totalDay=totalDay+day;
        System.out.println("这一天是这一年的第"+totalDay+"天");
    }
}
