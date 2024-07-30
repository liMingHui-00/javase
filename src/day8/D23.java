package day8;

/**
 * @Author：lmh
 * @Create: 2024-7-8 17:50
 */
public class D23 {
    public static void main(String[] args) {
        int count = 0;
        A:  for (int i = 101; i <= 200; i++) {
            for (int i1 = 2; i1 < i; i1++) {
                if (i % i1 == 0){
                    continue A;
                }
            }
            System.out.print(i+" ");
            count++;
            if (count==5){
                System.out.println();
                count = 0;
            }
        }
    }
}
