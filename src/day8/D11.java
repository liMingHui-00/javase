package day8;

import java.util.Random;

/**
 * @Author：lmh
 * @Create: 2024-7-8 15:17
 */
public class D11 {
    public static void main(String[] args) {
        String name[] = {"lisi","zhangSanFen","zhangCuiHua","xiongDa","guangTouQiang"};
        Random random = new Random();
        int index = random.nextInt(name.length);
        System.out.println(name[index]);
    }
}
