package day9;

import java.util.Random;
import java.util.Scanner;

/**
 * @Author：lmh
 * @Create: 2024-7-9 18:30
 */
public class D21 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(100)+1;
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int max = 100;
        int min = 0;
        while (true) {
            System.out.println("请猜一个数字：");
            int n = scanner.nextInt();
            if (n==num) {
                System.out.println("恭喜你，猜对了");
                count++;
                break;
            }
            if (n<num){
                System.out.println("猜小了,请输入"+n+"--"+max+"之间的数字");
                count++;
                min = n;
            }
            if (n>num) {
                max=n;
                System.out.println("猜大了,请输入"+min+"--"+n+"之间的数字");
                count++;
            }

        }
        System.out.println("一共猜了"+count+"次");
    }
}
