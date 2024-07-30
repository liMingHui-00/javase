package day8;

/**
 * @Author：lmh
 * @Create: 2024-7-8 14:30
 */
public class D7 {
    public static void main(String[] args) {
        int i = 1;
        do {
            if (i % 7 == 0 || i / 10 == 7 || i % 10 == 7) {

            } else {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= 100);
    }
}
