package day11;

import java.util.Random;

/**
 * @Author：lmh
 * @Create: 2024-7-11 21:38
 */
public class D22 {
    public static void main(String[] args) {
//        生成中奖号码
        int[] numArr = createNum();
        for (int a : numArr) {
            System.out.print(a + " ");
        }
    }

    public static int[] createNum() {
//        红球6个  蓝球1个
        int arr[] = new int[7];
        Random random = new Random();
        for (int i = 0; i < arr.length - 1; ) {
//            生成红球   1-33  不能重复
            int num = random.nextInt(33) + 1;
            boolean flage = contains(arr, num);
            //                没有重复
            if (flage) {
                arr[i] = num;
                i++;
            }
        }
//        生成蓝球号码
        arr[arr.length - 1] = random.nextInt(16) + 1;
        return arr;
    }

    //    查看红球是否重复
    public static boolean contains(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
//                有重复
                return false;
            }
        }
//        没有重复
        return true;
    }
}
