package day3;
import java.util.Scanner;
public class D9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入数据：");
            int age = sc.nextInt();
            System.out.println(age>=18 ? "成年":"未成年");
        }


    }
}