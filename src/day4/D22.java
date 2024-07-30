package day4;

import java.util.Scanner;

public class D22 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int sg = scanner.nextInt();
        int q = scanner.nextInt();
        boolean s = scanner.nextBoolean();
        if (sg > 180 || q > 1000 || s==true) {
            System.out.println("嫁吧，比上不足，比下有余");
        }
        if (sg<180&&q<1000&&s==false) {
            System.out.println("不嫁");
        }
        if (sg>180&&q>1000&&s==true) {
            System.out.println("我一定要嫁给他!!!");
        }
    }
}
