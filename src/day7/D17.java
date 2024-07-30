package day7;

/**
 * ClassName: D17
 * Package: day7
 * Description：
 *
 * @Author：lmh
 * @Create: 2024-7-7 16:25
 */
public class D17 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        for (int i = 0 ,j=a.length-1; i < j; i++,j--) {
            int t = a[i];
            a[i] = a[j];
            a[j] = t;

        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

        }
    }
}
