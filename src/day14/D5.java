package day14;

/**
 * @Author：lmh
 * @Create: 2024-7-14 16:16
 */
public class D5 {
    public static void main(String[] args) {
        int a[] ={1,2,3};
        System.out.println(arrToString(a));

    }
    public  static String arrToString(int a[]){
        String res ="[";
        for (int i = 0; i < a.length; i++) {
           if (i==a.length-1){
               res= res + a[i];
           }else {
               res= res + a[i]+",";
           }
        }
        res+="]";
        return res;
    };
}
