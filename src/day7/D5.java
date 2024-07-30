package day7;

/**
 * ClassName: D5
 * Package: day7
 * Description：
 *
 * @Author：lmh
 * @Create: 2024-7-7 11:59
 */
public class D5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i%10==9||i/10==9||i%9==0) {
                System.out.println(i);
            }
        }
    }
}
