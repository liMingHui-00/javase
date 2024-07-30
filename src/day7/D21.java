package day7;

/**
 * ClassName: D21
 * Package: day7
 * Description：
 *
 * @Author：lmh
 * @Create: 2024-7-7 18:19
 */
public class D21 {
    public static void main(String[] args) {
        int s =0;
        int arr [][] ={{3,5,8},{12,9},{7,0,6,4}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                s+=arr[i][j];
            }

        }
        System.out.println(s);
    }
}
