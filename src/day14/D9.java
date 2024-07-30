package day14;

/**
 * @Author：lmh
 * @Create: 2024-7-14 17:22
 */
public class D9 {
    public static void main(String[] args) {
        int [] arr ={1,2,3};
     String str =   arrToString(arr);
        System.out.println(str);
    }
    public  static  String  arrToString(int arr[]){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i==arr.length-1){
                sb.append(arr[i]);
            }else {
                sb.append(arr[i]).append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
