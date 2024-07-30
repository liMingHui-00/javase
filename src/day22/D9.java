package day22;
import java.util.Calendar;
public class D9 {
    public static void main(String[] args) {
        Calendar ca = Calendar.getInstance();
        System.out.println(ca.get(Calendar.YEAR));
        System.out.println(ca.get(Calendar.MONTH)+1);
        System.out.println(ca.get(Calendar.DATE));
        System.out.println(ca.get(Calendar.HOUR));
        System.out.println(ca.get(Calendar.MINUTE));
        System.out.println(ca.get(Calendar.SECOND));
        System.out.println(ca.get(Calendar.DAY_OF_WEEK)-1);
        System.out.println(ca.get(Calendar.DAY_OF_YEAR));
    }
}