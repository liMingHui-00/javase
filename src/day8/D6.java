package day8;

/**
 * @Author：lmh
 * @Create: 2024-7-8 14:28
 */
public class D6 {
    public static void main(String[] args) {
        int s = 1;
        int i = 1;
        do {
            s = s * i;
            i++;
        } while (i <= 10);
        System.out.println(s);
    }
}
