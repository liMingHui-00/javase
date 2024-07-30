package day7;

/**
 * ClassName: D19
 * Package: day7
 * Description：
 *
 * @Author：lmh
 * @Create: 2024-7-7 17:46
 */
public class D19 {
    public static void main(String[] args) {
        int arr [][] = {{1,2,3},{4,5,6,7},{8,9}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
