package day10;

/**
 * @Author：lmh
 * @Create: 2024-7-10 11:48
 */
public class D4 {
    public static void main(String[] args) {
        int arr [] = {1,2,44,4,51,7,6,8,9};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]>arr[i]){
                    int tem = arr[j];
                    arr[j] = arr[i];
                    arr[i]  =tem;
                }
            }
        }
        for (int a:arr){
            System.out.print(a+" ");
        }
    }
}
