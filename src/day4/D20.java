package day4;

import java.util.Scanner;

public class D20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        switch (m){
            case 3:
            case 4:
            case 5:
                System.out.println("春天");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏天");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋天");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬天");
                break;
        }
    }
}
