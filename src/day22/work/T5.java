package day22.work;

import java.util.Calendar;

public class T5 {
    public  static String jia(int n){
        if (n>=10){
            return n+"";
        }else {
            return "0"+n;
        }
    }
    public static void main(String[] args) {
        // 获取当前时间
        Calendar calendar = Calendar.getInstance();
        // 获取年、月、日、小时、分钟、秒
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        System.out.println(year+"-"+T5.jia(month)+"-"+T5.jia(day)+" "+T5.jia(hour)+":"+T5.jia(minute)+":"+T5.jia(second));
        // 获取星期几
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        // 转换星期几为中文
        String weekDay = getWeekday(dayOfWeek);
        // 格式化字符串
        String formattedDateTime = String.format("%d-%02d-%02d %02d:%02d:%02d %s",
                year, month, day, hour, minute, second, weekDay);
        System.out.println(formattedDateTime);
    }
    private static String getWeekday(int dayOfWeek) {
        switch (dayOfWeek) {
            case Calendar.SUNDAY:
                return "星期日";
            case Calendar.MONDAY:
                return "星期一";
            case Calendar.TUESDAY:
                return "星期二";
            case Calendar.WEDNESDAY:
                return "星期三";
            case Calendar.THURSDAY:
                return "星期四";
            case Calendar.FRIDAY:
                return "星期五";
            case Calendar.SATURDAY:
                return "星期六";
            default:
                return "未知";
        }
    }
}
