package day6;

import java.util.Random;
import java.util.Scanner;

public class D6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = new Random().nextInt(10);
        System.out.println(n);
        int count  = 0;
        while (true) {
            int gn=scanner.nextInt();
            count++;
            if (count==3){
                System.out.println("猜中了");
                break;
            }
            if (gn>n) {
                System.out.println("猜大了");
            } else if (gn<n) {
                System.out.println("小了");

            }else {
                System.out.println("猜中了");
                break;
            }
        }
    }
}
