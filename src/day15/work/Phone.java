package day15.work;

/**
 * @Author：lmh
 * @Create: 2024-7-15 18:53
 */
public class Phone {
    private String brand;
    private int price;
    private int year;

    public Phone() {
    }

    public Phone(String brand, int price, int year) {
        this.brand = brand;
        this.price = price;
        this.year = year;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
