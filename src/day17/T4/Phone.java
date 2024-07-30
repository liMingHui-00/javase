package day17.T4;

/**
 * @Author：lmh
 * @Create: 2024-7-17 19:11
 */
public abstract class Phone {
    private String brand;
    public Phone() {
    }

    public Phone(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
     public abstract void playMusic(String s);
}
