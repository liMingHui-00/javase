package day11;

import java.util.Random;
import java.util.Scanner;

/**
 * @Author：lmh
 * @Create: 2024-7-11 22:00
 */
public class D99 {
    public static void main(String[] args) {
        int []win1 = win();
        int []win2 = input();
        int count = px(win1,win2);
        System.out.println("中奖号码为：");
        for (int i = 0; i < win1.length; i++) {
            System.out.print(win1[i]+"\t");
        }
        System.out.println("相同号码数为："+count);
    }

    public static int[] win() {                                 //随机生成六位不同的数
        int[] win = new int[7];
        Random rd = new Random();
        int count = 1;
        for (int i = 0; i < win.length - 1; i++) {
            do {
                win[i] = rd.nextInt(33) + 1;
                for (int j = 0; j < i; j++) {
                    if (win[i] == win[j]) {
                        count = 0;
                        break;
                    }
                }
            } while (count == 0);
        }
        win[6] = rd.nextInt(16) + 1;
        return win;
    }

    public static int[] input() {                   //客户自己输入双色球
        int[] input1 = new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < input1.length; i++) {
            if (i <= input1.length - 2) {
                System.out.println("输入任意一个范围1-33的数字：");
            } else {
                System.out.println("输入任意一个范围1-16的数字：");
            }
            input1[i] = sc.nextInt();
        }
        return input1;
    }
    public static int px(int []a,int[]b){           //比较中奖号码
        int count =0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]==b[i]){
                count+=1;
            }
        }
        return count;
    }
}
