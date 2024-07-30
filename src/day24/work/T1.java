package day24.work;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class T1 {
    private static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
    private static final SimpleDateFormat simpleDateFormat =  new SimpleDateFormat(DATE_FORMAT);
//    将Date对象转换为字符串格式
    public static String dateToString(Date date){
        return simpleDateFormat.format(date);
    }
    //    字符串格式转化成Data
    public static Date stringToData(String s)  {
        try {
            return simpleDateFormat.parse(s);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args)  {
        // 将当前日期转换为字符串
        Date date = new Date();
        String s = T1.dateToString(date);
        System.out.println(s);
//        将字符串转化成日期对象
        String s2 = "2022-12-12 12:12:12";
        Date date1 = null;
        date1 = T1.stringToData(s2);
        System.out.println(date1);

    }
}
