package day10;

import java.util.Random;

/**
 * @Author：lmh
 * @Create: 2024-7-10 19:05
 */
public class D13 {
    public static void main(String[] args) {
        Random random = new Random();
        int a[] = new int[8];
        System.out.println("排序前：");
        for (int i = 0; i <a.length ; i++) {
            a[i] =random.nextInt(46)+35;
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("排序后：");
//        排序
        for (int i = 0; i < a.length-1; i++) {
            for (int i1 = i+1; i1 < a.length; i1++) {
                if (a[i1]>a[i]){
                    int t = a[i];
                    a[i]= a[i1];
                    a[i1]=t;
                }
            }
        }
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
