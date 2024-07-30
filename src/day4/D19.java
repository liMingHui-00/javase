package day4;

import java.util.Scanner;

public class D19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
       if ( 100>=score && score>=90){
           System.out.println("优");
       } else if (score>=80){
           System.out.println("良");
       }else if (score>=60){
           System.out.println("中");
       }else if ( score<60&& score>=0){
           System.out.println("差");
       }else {
           System.out.println("有误");
       }
    }

}
