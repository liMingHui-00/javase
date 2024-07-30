package day7;

/**
 * ClassName: D3
 * Package: day7
 * Description：
 *
 * @Author：lmh
 * @Create: 2024-7-7 11:44
 */
public class D3 {
    public static void main(String[] args) {
        for (int i = 9; i >= 1; i--) {
            for (int i1 = 1; i1 <= i; i1++) {
                System.out.print(i1*i);
                System.out.printf("\t");
            }
            System.out.println();
        }
    }
}
