package day9;

import java.util.Random;

/**
 * @Author：lmh
 * @Create: 2024-7-9 14:10
 */
public class D6 {
    public static void main(String[] args) {

        int arr [] = new int[10];
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            int nextInt = new Random().nextInt(20);
            arr[i] = nextInt;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            s+=arr[i];
        }
        System.out.println(s);
        System.out.println(s/arr.length);
    }
}
