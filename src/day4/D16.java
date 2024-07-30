package day4;

import java.util.Scanner;

public class D16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入当月利润（万元）：");
        double profit = scanner.nextDouble();
        double bonus = 0;

        if (profit <= 10) {
            bonus = profit * 0.10;
        } else if (profit <= 20) {
            bonus = 10 * 0.10 + (profit - 10) * 0.075;
        } else if (profit <= 40) {
            bonus = 10 * 0.10 + 10 * 0.075 + (profit - 20) * 0.05;
        } else if (profit <= 60) {
            bonus = 10 * 0.10 + 10 * 0.075 + 20 * 0.05 + (profit - 40) * 0.03;
        } else if (profit <= 100) {
            bonus = 10 * 0.10 + 10 * 0.075 + 20 * 0.05 + 20 * 0.03 + (profit - 60) * 0.015;
        } else {
            bonus = 10 * 0.10 + 10 * 0.075 + 20 * 0.05 + 20 * 0.03 + 40 * 0.015 + (profit - 100) * 0.01;
        }

        System.out.printf("应发放奖金总数为：%.2f万元\n", bonus);
    }
}
