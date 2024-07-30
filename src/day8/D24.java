package day8;

import java.util.Scanner;

/**
 * @Author：lmh
 * @Create: 2024-7-8 18:59
 */
public class D24 {
    public static void main(String[] args) {
        boolean flage = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("学生管理系统");
        System.out.println("1.查询学生");
        System.out.println("2.添加学生");
        System.out.println("3.编辑学生");
        System.out.println("4.删除学生");
        System.out.println("5.退出");
        while (flage) {
            System.out.println("请选择功能：");
            int ch = scanner.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("查询学生");
                    break;
                case 2:
                    System.out.println("添加学生");
                    break;
                case 3:
                    System.out.println("编辑学生");
                    break;
                case 4: 
                    System.out.println("删除学生");
                    break;
                case 5:
                    flage = false;
                    break;
                default:
                    System.out.println("该功能还没有开发");
                    break;
            }
        }
    }
}
