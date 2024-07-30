package day10;

/**
 * @Author：lmh
 * @Create: 2024-7-10 21:15
 */
public class D21 {
    public static void main(String[] args) {
//        选择排序
        int a[]= {17,72,19,16,18};
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i]<a[j]){
                    int k = a[i];
                    a[i] = a[j];
                    a[j]= k;
                }
            }
        }
        for (int bb:a){
            System.out.println(bb);
        }
    }
}
