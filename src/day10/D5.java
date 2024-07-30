package day10;

/**
 * @Author：lmh
 * @Create: 2024-7-10 14:37
 */
public class D5 {
    public static void main(String[] args) {
        int arr [] = {1,2,44,4,51,7,6,8};
        for (int i = 0; i < arr.length-1; i++) {
            for (int i1 = i+1; i1 < arr.length; i1++) {
                if (arr[i]<arr[i1]) {
                    int tem = arr[i];
                    arr[i] = arr[i1];
                    arr[i1]  =tem;
                }
            }

        }
        for (int l : arr) {
            System.out.println(l);
        }
    }
}
