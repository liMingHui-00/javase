package day10;

/**
 * @Author：lmh
 * @Create: 2024-7-10 10:45
 */
public class D2 {
    public static void main(String[] args) {
        int arr [] = {11,22,33,44,55,66,77};
        for (int i = 0; i < arr.length/2; i++) {
            int b = arr[i];
            arr[i]= arr[arr.length-i-1];
            arr[arr.length-i-1]=b;
        }
        for (int b :arr){
            System.out.println(b);
        }
    }
}
