package day4;

import java.util.Scanner;

public class D21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String m = scanner.next();
        switch (m){
            case "hot":
                System.out.println("热映");
                break;
            case "weekly":
                System.out.println("每周排行榜");
                break;
            case "us":
                System.out.println("北美排行榜");
                break;
            case "china":
                System.out.println("国产排行榜");
                break;
            case "highScore":
                System.out.println("高分排行榜");
                break;
            default:
                System.out.println("输入有误");
                break;
        }
    }
}
