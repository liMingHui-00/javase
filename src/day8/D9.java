package day8;

/**
 * @Author：lmh
 * @Create: 2024-7-8 14:43
 */
public class D9 {
    public static void main(String[] args) {
        int score[] = {100, 99, 78, 45, 23, 60, 20};
        int min = score[0];
        int max = score[0];
        for (int n:score){
                if (n>max){
                    max=n;
                }
                if (n<min){
                    min = n;
                }
        }
        System.out.println("最大值为：" + max);
        System.out.println("最小值为：" + min);
    }
}
