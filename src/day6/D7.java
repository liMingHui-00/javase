package day6;

import java.util.Scanner;

public class D7 {
    public static void main(String[] args) {
//        原始金额
        double money = 0.0;
//        结束循环
        boolean flag = true;

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; flag; i++) {
            System.out.println("=====ATM======");
            System.out.println("1、存款");
            System.out.println("2、取款");
            System.out.println("3、显示金额");
            System.out.println("4、退出");
            System.out.println("请选择（1-4）：");
//    获取用户的选择
            System.out.println("请选择你的操作");
            int selection = scanner.nextInt();
            switch (selection) {
                case 1:
//                    存款
                    System.out.println("请输入存款的金额");
                    int addMoney = scanner.nextInt();
//                    增加金额
                    money += addMoney;
                    System.out.println("存款成功");
                    break;
                case 2:
//                    取款
                    System.out.println("请输入取款的金额");
                    int subMoney = scanner.nextInt();
                    if (subMoney > money) {
                        System.out.println("金额不足，取款失败");
                        return;
                    } else {
                        //                    减少金额
                        money -= subMoney;
                        System.out.println("取款成功");
                    }
                    break;
                case 3:
//                    显示金额
                    System.out.println("当前金额为："+money);
                    break;
                case 4:
//                    关闭循环
                    flag = false;
                    System.out.println("欢迎下次光临");
                    break;
                default:
                    System.out.println("输入有误，请重新输入");
                    break;
            }
        }
    }
}
