package day17.T6;

/**
 * @Author：lmh
 * @Create: 2024-7-17 19:24
 */
public class Phone {
    private String brand;
    private int price;
    public void printPhone(){
        System.out.println(getBrand()+"手机，价格："+getPrice());
    }
    public Phone() {
    }
    public Phone(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String toString() {
        return "Phone{brand = " + brand + ", price = " + price + "}";
    }
}
