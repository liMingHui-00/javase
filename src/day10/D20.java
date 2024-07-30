package day10;

/**
 * @Author：lmh
 * @Create: 2024-7-10 20:52
 */
public class D20 {
    public static void main(String[] args) {
         int a[]= {17,72,19,16,18};
        for (int i = 0; i < a.length/2; i++) {
            int k = a[i];
            a[i] = a[a.length-1-i];
            a[a.length-1-i] = k;
        }
        for (int aa : a) {
            System.out.println(aa);
        }
    }
}
