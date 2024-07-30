package day7;

/**
 * ClassName: D4
 * Package: day7
 * Description：
 *
 * @Author：lmh
 * @Create: 2024-7-7 11:52
 */
public class D4 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i < 999; i++) {
            int ge = i%10;
            int shi = i/10%10;
            int bai = i/100;
            if (ge*ge*ge+bai*bai*bai+shi*shi*shi==i) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
}
