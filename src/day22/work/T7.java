package day22.work;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class T7 {
        public static void main(String[] args) {
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E");
            String s = sdf.format(date);
            System.out.println(s);
            Calendar ca = Calendar.getInstance();
            int year = ca.get(Calendar.YEAR);
            int month = ca.get(Calendar.MONTH)+1;
            jia(month);
            int day = ca.get(Calendar.DATE);
            jia(day);
            int hour = ca.get(Calendar.HOUR_OF_DAY);
            jia(hour);
            int minute = ca.get(Calendar.MINUTE);
            jia(minute);
            int second = ca.get(Calendar.SECOND);
            jia(second);
            int week = ca.get(Calendar.DAY_OF_WEEK)-1;
            System.out.println(year+"-"+jia(month)+"-"+jia(day)+" "+jia(hour)+":"+jia(minute)+":"+jia(second)+" "+"星期"+(week));
        }
        public static String jia(int i){
            String s = "";
            if (i>=0 && i<=9){
                s = "0"+i;
            }
            else {
                s = i+"";
            }
            return s;
        }
}

