package day8;

/**
 * @Author：lmh
 * @Create: 2024-7-8 17:19
 */
public class D16 {
    public static void main(String[] args) {
        A:
        for (int i = 0; i < 4; i++) {
            for (int i1 = 0; i1 < 3; i1++) {
                if (i==2){
                    continue A;
                } System.out.println(i+"----"+i1);
            }
        }
    }
}
