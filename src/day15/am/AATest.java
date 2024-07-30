package day15.am;

import day15.pm.AA;

/**
 * @Author：lmh
 * @Create: 2024-7-15 16:04
 */
public class AATest {
    public static void main(String[] args) {
        AA aa = new AA();
        System.out.println(aa.pub);
        /*
        不同包中的类只能访问公共的成员变量和成员方法
        */

//        System.out.println(aa.pro);
//        System.out.println(aa.que);
//        System.out.println(aa.pri);
    }
}
