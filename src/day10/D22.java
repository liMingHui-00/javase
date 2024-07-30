package day10;

/**
 * @Author：lmh
 * @Create: 2024-7-10 21:39
 */
public class D22 {
    public static void main(String[] args) {
        int a[]= {17,72,19,16,18};
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j]<a[j+1]){
                    int k = a[j];
                     a[j]=a[j+1];
                     a[j+1]=k;
                }
            }
        }
        for (int cc:a){
            System.out.println(cc);
        }
    }
}
