package day8;

/**
 * @Author：lmh
 * @Create: 2024-7-8 15:35
 */
public class D12 {
    public static void main(String[] args) {
        for (int i = 9; i >= 1; i--) {
            int k = 1;
            do {
                System.out.printf(k + "*" + i + "=" + k * i + "\t");
                k++;
            } while (k <= i);
            System.out.println();
        }
        int x = 1;
        do {
            for (int y = 1; y <= x; y++) {
                System.out.printf(x + "*" + y + "=" + x * y + "\t");
            }
            System.out.println();
            x++;
        } while (x <= 9);
    }
}
