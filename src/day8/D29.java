package day8;

/**
 * @Author：lmh
 * @Create: 2024-7-8 21:32
 */
public class D29 {
    public static void main(String[] args) {
        int aee[]  =new  int[]{32,35,36,34,36,38,37,39,31};
        int target = 31;
        for (int i = 0; i < aee.length; i++) {
            if (target==aee[i]){
                System.out.println("找到了"+(i+1));
                break;
            }
        }
        System.out.println(aee.length);
    }
}
