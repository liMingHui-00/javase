package day8;

/**
 * @Author：lmh
 * @Create: 2024-7-8 18:55
 */
public class D25 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
