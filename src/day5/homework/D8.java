package day5.homework;

import java.util.Scanner;

public class D8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int s =0;
        for (int x= 1 ;x<month;x++){
            if (x==1||x==3||x==5||x==7||x==8||x==10||x==12){
                s=31;
            }else if (x==4||x==6||x==9||x==11){
                s=30;
            } else if (x == 2) {
                if (year%400==0||(year%4==0&&year%100!=0)){
                    s=29;
                }else {
                    s=28;
                }
            }
            day=day+s;
        }
        System.out.println("是这一年的第"+day+"天");
    }
}
