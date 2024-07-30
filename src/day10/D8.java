package day10;

import java.util.Random;

/**
 * @Author：lmh
 * @Create: 2024-7-10 16:43
 */
public class D8 {
    public static void main(String[] args) {
        int arr[][] = new int[3][5];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int i1 = 0; i1 < arr[i].length; i1++) {
                arr[i][i1] = random.nextInt(10);
                System.out.print(arr[i][i1]+" ");
            }
            System.out.println();
        }

        int b[] = arr[0];
        for (int i = 0;i<b.length-1;i++){
            for (int j = i+1;j<b.length;j++)
            {
                if (b[j]<b[i]){
                    int t = b[j];
                    b[j]= b[i];
                    b[i]= t;
                }
            }
        }
        for (int bb : b) {
            System.out.println(bb);
        }
    }
}
