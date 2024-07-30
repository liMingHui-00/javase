package day9;

/**
 * @Author：lmh
 * @Create: 2024-7-9 19:16
 */
public class D26 {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3};
        int [] arr2 = {4,5,6};
        int [] arr3 = new  int[arr2.length+arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length+i] = arr2[i];
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]+" ");
        }
    }
}
