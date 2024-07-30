package day12.work;

/**
 * @Author：lmh
 * @Create: 2024-7-12 19:34
 */
public class Computer {
    String brand;
    double price;
    public Computer(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }
    public void coding(String yy){
        System.out.println(brand+"电脑正在使用"+yy+"语言编程");
    }
    public  void  playGame(String xx){
        System.out.println(brand+"电脑正在玩"+xx);
    }
}
