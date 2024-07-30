package day8;

/**
 * @Author：lmh
 * @Create: 2024-7-8 21:39
 */
public class D26 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < a.length/2; i++) {
            int t = a[i];
            a[i] = a[a.length-1-i];
            a[a.length-i-1] = t;
        }
        for (int b:a){
            System.out.println(b);
        }
    }
}
