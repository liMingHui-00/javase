package day24;

import java.util.Scanner;

public class D7 {
    public static void main(String[] args) {
        System.out.println("请输入你的年龄");
        Scanner scanner = new Scanner(System.in);
        if (scanner.nextInt()>100){
            throw new RuntimeException("你活的****");
        }else {
            System.out.println("继续好好活着吧");
        }
    }
}
