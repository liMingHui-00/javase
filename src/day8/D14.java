package day8;

/**
 * @Author：lmh
 * @Create: 2024-7-8 16:14
 */
public class D14 {
    public static void main(String[] args) {
        int count = 0;
        double page =0.1;
        while (true) {
            page=page*2;
            count++;
            if (page>8844430){
                break;
            }
        }
        System.out.println(count);
    }
}
