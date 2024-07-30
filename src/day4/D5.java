package day4;

import java.util.Scanner;

public class D5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num%7==0 || num%10==7 || num/10==7){
            System.out.println("是7的");
        }else{
            System.out.println("不是");
        }
    }

}
