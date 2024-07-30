package day8;

/**
 * @Author：lmh
 * @Create: 2024-7-8 17:50
 */
public class D18 {
    public static void main(String[] args) {
        A:
        for (int i = 2; i <= 100; i++) {
            for (int i1 = 2; i1 < i; i1++) {
                if (i%i1==0){
//                    能够整除，不是质数
                    continue A;
                }
            }
//            打印质数
            System.out.println(i);
        }
    }
}
