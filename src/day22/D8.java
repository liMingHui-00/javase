package day22;

import java.util.Date;

public class D8 {
    public static void main(String[] args) {
//        Date date = new Date();
//        System.out.println(date.getYear());
//        System.out.println(date.getTime());
//        Date date1 = new Date(1000);
//        System.out.println(date1);
//        System.out.println(date1.getTime());
        Date date = new Date();
        Date tui = new Date(124,6,25);
        if (date.before(tui)){
            System.out.println("tui");
        }
        int year = date.getYear() + 1900;
        int month = date.getMonth() + 1;
        int day = date.getDate();
        Date date1 = new Date();
        System.out.println(date1.getDate());
        System.out.println(year+"--"+month+"--"+day);
    }
}
