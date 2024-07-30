package day9;

/**
 * @Author：lmh
 * @Create: 2024-7-9 14:45
 */
public class D7 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        System.out.println(arr);
        int arr2[] = arr;
        arr2[0] = 0;
        System.out.println(arr == arr2);
        System.out.println(arr[0]);
        System.out.println(arr2);
    }
}
