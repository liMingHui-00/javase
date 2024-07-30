package day14;

/**
 * @Author：lmh
 * @Create: 2024-7-14 16:50
 */
public class D7 {
    public static void main(String[] args) {
        String phone = "13784569124";
        String begin = phone.substring(0,3);
        String end = phone.substring(7);
        System.out.println(begin+"****"+end);
        System.out.println(phone.charAt(0));
    }
}
