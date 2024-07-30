package day17.abstractTest;

/**
 * @Author：lmh
 * @Create: 2024-7-17 17:00
 */
public class DDD {
    public static void main(String[] args) {
        DTest dTest =  new DTest();
        D1 d1[] = {dTest};
        for (D1 d11:d1){
            d11.fn();
        }
    }
}
