package day5.homework;
import java.util.Scanner;
public class D1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入最终公里数：");
            double distance = scanner.nextDouble();
            System.out.println("请输入等待时间（分钟）：");
            int waitTime = scanner.nextInt();
            double fare = 0;
            if (distance <= 3) {
                fare = 10;
            } else if (distance <= 15) {
                fare = 10 + (distance - 3) * 2;
            } else {
                fare = 10 + (15 - 3) * 2 + (distance - 15) * 3;
            }
            int waitMultiplier = waitTime / 5;
            fare += waitMultiplier * 2;
            System.out.printf("应付的车费为"+ fare+"元");
        }
    }