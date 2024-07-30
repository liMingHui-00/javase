package day7;

/**
 * ClassName: D6
 * Package: day7
 * Description：
 *
 * @Author：lmh
 * @Create: 2024-7-7 12:01
 */
public class D6 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 101; i++) {
            if (i%10==3||i/10==3) {
            }else {
                System.out.print(i+" ");
                count++;
                if (count%5==0){
                    System.out.println();
                }

            }
        }
    }
}
