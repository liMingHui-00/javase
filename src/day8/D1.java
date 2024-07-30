package day8;

/**
 * ClassName: D1
 * Package: day8
 * Description：
 *
 * @Author：lmh
 * @Create: 2024-7-8 8:48
 */
public class D1 {
    public static void main(String[] args) {
        int sum = 0;
        int jc =1;
        for (int i = 1; i <=10 ; i++) {
            jc*=i;
            sum+=jc;
        }
        System.out.println(sum);
    }
}
