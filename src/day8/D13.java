package day8;

import java.util.Random;
import java.util.Scanner;

/**
 * @Author：lmh
 * @Create: 2024-7-8 15:48
 */
public class D13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    int n =       new Random().nextInt(100);
        while (true) {
            System.out.println("请猜一个数字");
          int guess  =   scanner.nextInt();
          if (guess==n){
              System.out.println("猜对了");
              break;
//              continue;
          }else {
              System.out.println("猜错了");
          }
        }
        System.out.println("游戏结束");
    }
}
