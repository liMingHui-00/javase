package day24;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class D6 {
    public static void main(String[] args)  {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String d = "2024-2-2";
        Date date = null;
        try {
            date = sdf.parse(d);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        System.out.println(date);
    }
}
