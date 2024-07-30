package day10;

import java.util.Scanner;

/**
 * @Author：lmh
 * @Create: 2024-7-10 19:38
 */
public class D18 {
    public static void main(String[] args) {
        int a[]= {17,72,19,16,18};
        Scanner scanner = new Scanner(System.in);
        int b[]  =new  int[5];
        System.out.println("请输入b数组的数据");
        for (int i = 0; i < b.length; i++) {
            b[i]= scanner.nextInt();
        }
//        升序
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j <a.length-i-1 ; j++) {
                if (a[j]>a[j+1]){
                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }
            }
        }
        System.out.println("第一个数组排序结果：");
        for (int aa: a){
            System.out.print(aa +" ");
        }
        System.out.println();
        System.out.println("第二个数组排序结果：");
        for (int i = 0; i < b.length-1; i++) {
            for (int j = 0; j < b.length-i-1; j++) {
                if (b[j]>b[j+1]){
                    int t = b[j];
                    b[j] = b[j+1];
                    b[j+1] = t;
                }
            }
        }
        for (int bb: b){
            System.out.print(bb +" ");
        }
        System.out.println();
//判断数据相等
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int i1 = 0; i1 < b.length; i1++) {
                if (b[i1]==a[i]){
                    count++;
                }
            }
        }
        System.out.println("一共有"+count+"个数字相等");
    }
}
