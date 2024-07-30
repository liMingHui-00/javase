package day27;

import java.util.Arrays;

public class D3 {
    public static void main(String[] args) {
        String str[]  = {"lisi","wangwu","zhnagsan"};
        System.out.println(Arrays.asList(str));
        Integer n [] = {-5,9,-7,6,12};
        System.out.println(Arrays.toString(n));
        Arrays.sort(n);
        System.out.println(Arrays.toString(n));
        System.out.println(Arrays.binarySearch(n, 6));
    }
}
