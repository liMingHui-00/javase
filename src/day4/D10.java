package day4;

import java.util.Scanner;

public class D10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        switch (day){
            case 1:
                System.out.println("周一");
                break;
            case 2 :
                System.out.println("周二");
                break;
            case 3 :
                System.out.println("周3");
                break;
            case 4:
                System.out.println("周4");
                break;
            case 5 :
                System.out.println("周5");
                break;
            case 6 :
                System.out.println("周6");
                break;
            case 7 :
                System.out.println("周7");
                break;
            default:
                System.out.println("有误");
                break;

        }
    }
}
