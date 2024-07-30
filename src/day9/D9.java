package day9;

import java.util.Random;

/**
 * @Author：lmh
 * @Create: 2024-7-9 16:44
 */
public class D9 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            int nextInt = new Random().nextInt(100);
            arr[i] = nextInt;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max <= arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
