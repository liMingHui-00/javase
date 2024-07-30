package day7;

/**
 * ClassName: D15
 * Package: day7
 * Description：
 *
 * @Author：lmh
 * @Create: 2024-7-7 16:00
 */
public class D15 {
    public static void main(String[] args) {
        int a[] = {5,7,6,9,2,4};
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i]>=max){
                max=a[i];
            }
        }
        System.out.println(max);
    }
}
