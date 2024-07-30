package day10;

/**
 * @Author：lmh
 * @Create: 2024-7-10 16:00
 */
public class D7 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 44, 4, 51, 7, 6, 8, 9};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j]<arr[j+1]) {
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
        for (int m : arr) {
            System.out.println(m);
        }
    }
}
