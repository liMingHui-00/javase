package day8;

/**
 * @Author：lmh
 * @Create: 2024-7-8 18:20
 */
public class D19 {
    public static void main(String[] args) {
        long money  = 1000000000;
        int day = 0;
        while (money>0){
            money = money/2;
            day++;
        }
        System.out.println(day);
    }
}
