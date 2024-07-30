package day3;

import java.util.Scanner;

public class D21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println((n%7==0)?"过":n);
    }
}
