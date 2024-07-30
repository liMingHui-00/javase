package day15.work;

import java.util.Scanner;

/**
 * @Author：lmh
 * @Create: 2024-7-15 19:40
 */
public class MathTest {
    public static void main(String[] args) {
        System.out.println("请输入第一个数");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("请输入第二个数");
        int b = scanner.nextInt();
        System.out.println("请输入第三个数（0：加，1：减，2：乘，3：除）");
        int c = scanner.nextInt();
        switch (c) {
            case 0:
                Math.sum(a,b);
                break;
            case 1:
                Math.sum(a,b);
                break;
            case 2:
                Math.cheng(a,b);
                break;
            case 3:
                Math.chu(a,b);
                break;
            default:
                System.out.println("输入有误");
        }

    }
}
