package day22.work;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class D2 {
    public static void main(String[] args) {
//        中奖号码
        Random random=  new Random();
        int zjArr[] = new int[7];
        for (int i = 0; i < 6; i++) {
            zjArr[i] = random.nextInt(32)+1;
            for (int j = 0;j<i;j++){
//                判断唯一
                if (zjArr[j]==zjArr[i]){
                    i--;
                    break;
                }
            }
        }
//        蓝球中奖号码
        zjArr[zjArr.length-1]= random.nextInt(15)+1;
//        中奖号码
        System.out.println(Arrays.toString(zjArr));
//
        System.out.println("输入自己的中奖号码");
        Scanner scanner = new Scanner(System.in);
//        买球
        int myArr[] = new int[7];
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] =scanner.nextInt();
        }

//
        int rnum = 0;
        int brum =0;
        for (int i = 0; i < zjArr.length-1; i++) {
            for (int j = 0; j < myArr.length-1; j++) {
                if (zjArr[i]==myArr[j]){
                    rnum++;
                }
            }
        }
        if(zjArr[6] == myArr[6]){
            brum=1;
        }
        System.out.println(rnum);
        System.out.println(brum);
    }
}
