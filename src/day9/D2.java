package day9;

import java.util.Random;

/**
 * @Author：lmh
 * @Create: 2024-7-9 10:49
 */
public class D2 {
    public static void main(String[] args) {
        int n =  new Random().nextInt(10);
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            int x =  new Random().nextInt(10);
            arr[i] = x;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
