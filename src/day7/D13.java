package day7;

/**
 * ClassName: D13
 * Package: day7
 * Description：
 *
 * @Author：lmh
 * @Create: 2024-7-7 15:31
 */
public class D13 {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,7,8,9,10};
        int cou = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                cou++;
            }
        }
        System.out.println(cou);
    }
}
