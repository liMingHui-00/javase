package day3;
import java.util.Scanner;

public class D10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("整数");
        int num = scanner.nextInt();
        System.out.println(num);
        System.out.println("小数");
        double num2 = scanner.nextDouble();
        System.out.println(num2);
        System.out.println("字符串");
        String str = scanner.next();
        System.out.println(str);
        System.out.println("true false");
        boolean b = scanner.nextBoolean();
        System.out.println(b);
    }
}
