package day10;

/**
 * @Author：lmh
 * @Create: 2024-7-10 19:33
 */
public class D17 {
    public static void main(String[] args) {
       int a[] =   {171,72,19,16,118,51,210,7,18};
        for (int i = 0; i < a.length/2; i++) {
                int t = a[i];
                a[i] = a[a.length-i-1];
                a[a.length-i-1] = t;
        }
        for (int b :a){
            System.out.print(b+" ");
        }
    }
}
