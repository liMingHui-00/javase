package day10;

import java.util.Arrays;

/**
 * @Author：lmh
 * @Create: 2024-7-10 10:53
 */
public class D3 {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,7,8,9};
//        for (int i = 0; i < arr.length / 2; i++) {
//            int b = arr[i];
//            arr[i] = arr[arr.length-i-1];
//            arr[arr.length-1-i] = b;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
        int b[] = new  int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            b[i] = arr[arr.length-i-1];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print( b[i]+" ");
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
