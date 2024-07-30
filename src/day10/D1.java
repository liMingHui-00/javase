package day10;

/**
 * @Author：lmh
 * @Create: 2024-7-10 8:57
 */
public class D1 {
    public static void main(String[] args) {
        int arr [] = {11,22,33,44,55,66,77};
        int b[] = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
//            b的下标等于arr的长度-1-arr的下标
            b[arr.length-1-i]  =arr[i];
        }
        for (int s :b){
            System.out.println(s);
        }
    }
}
