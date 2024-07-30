package day3;

import java.util.Scanner;

public class D22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n %10 ==7 ||(n>=70&&n<=79)) {
            System.out.println("过");
        }else {
            System.out.println(n);
        }
    }
}
