package day3;

import java.util.Scanner;

public class D20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println((n%2==0)?"你输入的数是个偶数":"你输入的数是个奇数");
    }
}
