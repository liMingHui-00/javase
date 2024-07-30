package day5.am;

import java.util.Scanner;

public class D3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        for (int i = n; i < m; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }

        }
    }
}
