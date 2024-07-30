package day5.homework;

import java.util.Scanner;

public class D11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int s =0;
        int current = 0;
        for (int i = 1 ;i<=n;i++){
            current = a+current*10;
            s = s+current;
        }
        System.out.println(s);
    }
}
