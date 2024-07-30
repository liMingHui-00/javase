package day22;
import java.util.Calendar;
public class D10 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR,1);
        calendar.set(Calendar.DAY_OF_WEEK,6);
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
    }
}
