package day9;

/**
 * @Author：lmh
 * @Create: 2024-7-9 11:50
 */
public class D5 {
    public static void main(String[] args) {
        int arr[][] = {{1,2}, {5, 6, 8, 9}, {4, 35, 7, 8, 11}};
        int arr1[] = {5, 6, 8, 9};
//        for (int i:arr1) {
//            System.out.println(i);
//        }
        for (int[] i:arr) {
            for (int e :i){
                System.out.println(e);
            }

        }
    }
}
