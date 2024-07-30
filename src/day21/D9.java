package day21;

import java.util.Arrays;

public class D9 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int a[] = new int[4];
        System.arraycopy(arr,0,a,0,4);
        a[0] = 0;

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(a));
    }
}
