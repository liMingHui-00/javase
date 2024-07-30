package day10;

import java.util.Arrays;

/**
 * @Author：lmh
 * @Create: 2024-7-10 17:20
 */
public class D10 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 44, 4, 51, 7, 6, 8, 9};
//        for (int i = 0; i < arr.length-1; i++) {
//            for (int i1 = 0; i1 < arr.length-i-1; i1++) {
//                if (arr[i1]>arr[i1+1]){
//                    int t = arr[i1+1];
//                    arr[i1+1]= arr[i1];
//                    arr[i1]=t;
//                }
//            }
//        }
//        for (int b: arr){
//            System.out.println(b);
//        }



//        for (int i = 0; i < arr.length-1; i++) {
//            for (int i1 = i+1; i1 < arr.length; i1++) {
//                if (arr[i1]>arr[i]){
//                    int t = arr[i];
//                    arr[i]= arr[i1];
//                    arr[i1]=t;
//                }
//            }
//        }
        Arrays.sort(arr);
        for (int b: arr){
            System.out.println(b);
        }
    }
}
