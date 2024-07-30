package day22.work;

import java.util.Calendar;
import java.util.Scanner;
public class T9 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你出生的年月日");
            int year = sc.nextInt(),month = sc.nextInt(),day = sc.nextInt();
            Calendar ca = Calendar.getInstance();
            Calendar ca1 = Calendar.getInstance();
            ca.set(year,month-1,day);
            System.out.println("年龄："+(2024-year));
            System.out.println("出生到现在的天数:"+(ca1.getTimeInMillis() - ca.getTimeInMillis())/60/60/24/1000);
            System.out.println("当年天数："+ca.get(ca.DAY_OF_YEAR));
//            aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
        }
}

