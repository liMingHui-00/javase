package day8;

/**
 * @Author：lmh
 * @Create: 2024-7-8 14:26
 */
public class D5 {
    public static void main(String[] args) {
        int os = 0;
        int js = 0;
        int i = 1;
        do {
            if (i % 2 == 0) {
                os += i;
            } else {
                js += i;
            }
            i++;
        } while (i <= 100);
        System.out.println(os);
        System.out.println(js);
    }
}
