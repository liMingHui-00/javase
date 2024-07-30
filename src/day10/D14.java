package day10;

import java.util.Random;

/**
 * @Author：lmh
 * @Create: 2024-7-10 19:13
 */
public class D14 {
    public static void main(String[] args) {
        Random random = new Random();
        int a[] = new int[8];
        boolean b =false;
        for (int i = 0; i <a.length ; i++) {
            a[i] =random.nextInt(11)+10;
            if (a[i]/16==1) {
                b=true;
                break;
            }
        }
        if (b){
            System.out.println("数组包含16");
        }else {
            System.out.println("数组不包含16");
        }
    }
}
