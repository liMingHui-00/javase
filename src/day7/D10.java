package day7;

import java.util.Scanner;

/**
 * ClassName: D10
 * Package: day7
 * Description：
 *
 * @Author：lmh
 * @Create: 2024-7-7 12:50
 */
public class D10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        int count  = scanner.nextInt();
        int temp = 0;
        int s  = 0;
        for (int i = 0; i < count; i++) {
         temp = temp*10+a;
         s+=temp;
//         10 110 1110
        }
        System.out.println(s);
    }
}
