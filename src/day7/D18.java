package day7;

import java.util.Random;
import java.util.Scanner;

/**
 * ClassName: D18
 * Package: day7
 * Description：
 *
 * @Author：lmh
 * @Create: 2024-7-7 17:20
 */
public class D18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入有几个人学生");
        int stu = scanner.nextInt();
//        学生成绩
        int arr[] = new int[stu];
//       生成随机成绩
        for (int i = 0; i < stu; i++) {
            arr[i] = new Random().nextInt(100);
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max <= arr[i]) {
                max = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println("第" + i + 1 + "个学生的成绩为" + arr[i]);
        }
        System.out.println("最大成绩为" + max);
    }
}
