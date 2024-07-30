package day11.work;

/**
 * @Author：lmh
 * @Create: 2024-7-11 18:54
 */
public class Phone {
    String brand;
    int price;
    public void call(int price){
        System.out.println("正在使用价格为"+price+"元的手机打电话....");
    }
    public void sendMessage(String brand){
        System.out.println("正在使用"+brand+"品牌的手机发短信....");
    }
}
