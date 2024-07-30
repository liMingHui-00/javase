package day7;

/**
 * ClassName: D14
 * Package: day7
 * Description：
 *
 * @Author：lmh
 * @Create: 2024-7-7 15:49
 */
public class D14 {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0) {
                arr[i]=arr[i]/2;
            }else {
                arr[i] = arr[i]*2;
            }
            System.out.println(arr[i]);
        }
    }
}
