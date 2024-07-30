package day22.work;

import java.util.Random;
import java.util.Scanner;

public class T8 {
        public static void main(String[] args) {
//        1，定义一个数组来保存中奖号码[ 随机产生，6个红球1个蓝球号码]
            Random ran = new Random();
            Scanner sc = new Scanner(System.in);
            int[] red = new int[6];
            int blue = ran.nextInt(16) + 1;
//            蓝球中奖号码
            System.out.println(blue);
            for (int i = 0; i < red.length; i++) {
                red[i] = ran.nextInt(33) + 1;
            }
//            红球中奖号码
            for (int a : red){
                System.out.print(a+" ");
            }
            System.out.println();
//        2，定义一个数组来保存你要买的号码(控制台输入)
            System.out.print("\n请依次输入6个自选的红色号码，空格隔开【1 --33】：");
            int[] red2 = new int[6];
            for (int i = 0; i < red2.length; i++) {
                red2[i] = sc.nextInt();
            }
            System.out.println("请输入自选的蓝色号码【1--16】：");
            int blue2 = sc.nextInt();
//        3，定义两个变量，分别保存红球中奖个数和蓝球中奖个数
            int rednum = 0, bluenum = 0;
//        4，判断你的奖金
            for (int i = 0; i < red.length; i++) {
                for (int i1 = 0; i1 < red2.length; i1++) {
                    if (red[i] == red2[i1] && red[i] != 0 && red2[i1] != 0) {
                        red[i] = 0;
                        red2[i1] = 0;
                        rednum++;
                        break;
                    }
                }
            }
            if (blue == blue2){
                bluenum++;
            }
            if (rednum + bluenum == 7){
                System.out.println("一等奖，一亿");
            }
            else if (rednum + bluenum == 6) {
                if (rednum == 5 && bluenum == 1){
                    System.out.println("三等奖，3000");
                }
                else{
                    System.out.println("二等奖，5000万");
                }

            } else if (rednum + bluenum == 5){
                System.out.println("四等奖，200");
            }
            else if (rednum + bluenum == 4){
                System.out.println("五等奖，10");
            }
            else if (rednum + bluenum == 3 || rednum + bluenum == 2 || (rednum == 0 && bluenum == 1)){
                System.out.println("六等奖，5");
            }
            else{
                System.out.println("七等奖，......");
            }
        }
    }

