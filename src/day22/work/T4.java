package day22.work;

import java.util.Scanner;

public class T4 {
//    控制台输入圆柱的高度和半径，计算并打印圆柱的体积【四舍五入保留两位小数】
public static void main(String[] args) {
    System.out.println("请输入高");
    Scanner scanner = new Scanner(System.in);
    double height = scanner.nextDouble();
    System.out.println("请输入半径");
    double r = scanner.nextDouble();
    ;
    System.out.println("圆柱的体积为："+Math.round(r*r*Math.PI*height*100)/100.00);
}
}























