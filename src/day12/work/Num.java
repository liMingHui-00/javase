package day12.work;

/**
 * @Author：lmh
 * @Create: 2024-7-12 19:43
 */
public class Num {
    public boolean isSXH(int num){
        boolean issxh;
        int ge = num%10;
        int shi = num/10%10;
        int bai = num/100;
        if (ge*ge*ge+shi*shi*shi+bai*bai*bai==num){
            issxh = true;
        }else {
            issxh = false;
        }
        return  issxh;
    }
}
