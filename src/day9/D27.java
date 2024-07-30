package day9;

/**
 * @Author：lmh
 * @Create: 2024-7-9 19:20
 */
public class D27 {
    public static void main(String[] args) {
        int a[] ={171,72,19,16,118,51,210,7,18};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if ((a[i]%10!=7&&a[i]/10!=7)&&(a[i]%2==0)) {
                sum+=a[i];
            }
        }
        System.out.println(sum);
    }
}
