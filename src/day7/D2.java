package day7;

/**
 * ClassName: D2
 * Package: day7
 * Description：
 *
 * @Author：lmh
 * @Create: 2024-7-7 10:51
 */
public class D2 {
    public static void main(String[] args) {
        for (int i = 9; i >=1; i--) {
            for (int i1 = 0; i1 <9-i ; i1++) {
                System.out.printf("\t");
            }
            for (int i1 = 1; i1 <= i; i1++) {
                System.out.print(i*i1);
                System.out.printf("\t");
            }
            System.out.println();
        }
    }
}
