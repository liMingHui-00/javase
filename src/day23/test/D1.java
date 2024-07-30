package day23.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class D1 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("y-MM-d H:mm:ss E");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("y-MM-d");
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("H:mm:ss E");
        Date date = new Date();
//        String format = simpleDateFormat.format(date);
        String format1 = simpleDateFormat1.format(date);
        System.out.println(format1);
        String sd ="2000-11-10";
        Date parse = simpleDateFormat.parse(sd);
        System.out.println(parse);
    }
}
