package day25.work;

import java.util.ArrayList;
import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            System.out.println("请输入第"+(i+1)+"个学生的成绩");
             list.add(scanner.nextInt());
        }
        for (int i = 0; i < list.size(); i++) {
           for (int j=0;j<list.size()-i-1;j++){
               if (list.get(j)<list.get(j+1)){
                   int tem = list.get(j);
                   list.set(j,list.get(j+1));
                  list.set(j+1,tem);
               }
           }
        }
        System.out.println(list);
        for (Integer integer : list) {
            if (integer < 60) {
                System.out.println(integer);
            }
        }
        System.out.println("最大值为"+list.get(0));
        System.out.println("最小值为"+list.get(list.size()-1));
        int count  =0;
        for (Integer integer : list) {
            if (integer >= 60) {
                count++;
            }
        }
        System.out.println("及格率为"+count/10.0);
    }
}
