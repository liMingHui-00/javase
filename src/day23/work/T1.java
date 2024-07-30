package day23.work;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        System.out.println("请输入你的身份证");
        Scanner scanner = new Scanner(System.in);
        String sfz =scanner.next();
        if (sfz.length()==18){
            String year = sfz.substring(6, 10);
            String month = sfz.substring(10,12);
            String day = sfz.substring(12,14);
             int age = 2024 - Integer.parseInt(year);
            System.out.println("你的年龄为："+age);
//            获取当前时间到1970年的毫秒数
            Date date = new Date();
            long oldTime =  date.getTime();
//            获取出生时间到基准时间的毫秒数
            Calendar calendar = Calendar.getInstance();
            calendar.set(Integer.parseInt(year),Integer.parseInt(month)-1,Integer.parseInt(day));
            long csmillis = calendar.getTimeInMillis();
            System.out.println("你从出生到现在过了"+(oldTime-csmillis)/1000/60/60/24+"天");
            System.out.println("你出生的那一天是当年的第"+calendar.get(Calendar.DAY_OF_YEAR)+"天");
        }else {
            System.out.println("你输入的身份证号码不合法");
        }
    }
}
