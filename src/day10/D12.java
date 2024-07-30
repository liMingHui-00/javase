package day10;

import java.util.Random;

/**
 * @Author：lmh
 * @Create: 2024-7-10 18:56
 */
public class D12 {
    public static void main(String[] args) {
        Random random = new Random();
        int a[] = new int[8];
        System.out.println("排序前：");
        for (int i = 0; i <a.length ; i++) {
            a[i] =random.nextInt(71)+10;
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("排序后：");
//        排序
        for (int i = 0; i < a.length-1; i++) {
            for (int i1 = 0; i1 < a.length-1-i; i1++) {
                if (a[i1]>a[i1+1]){
                    int t = a[i1+1];
                    a[i1+1]= a[i1];
                    a[i1]=t;
                }
            }
        }
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
