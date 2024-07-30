package day8;

/**
 * @Author：lmh
 * @Create: 2024-7-8 21:36
 */
public class D28 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6};
        int b[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[b.length-1-i]= a[i];
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+" ");
        }
    }
}
