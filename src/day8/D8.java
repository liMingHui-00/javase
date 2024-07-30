package day8;

/**
 * @Author：lmh
 * @Create: 2024-7-8 14:32
 */
public class D8 {
    public static void main(String[] args) {
        int i = 1;
        do {
            int k = 1;
            do {
                System.out.print(k + "*" + i + "=" + k * i + "\t");
                k++;
            } while (k <= i);
            i++;
            System.out.println();
        } while (i <= 9);
    }
}
