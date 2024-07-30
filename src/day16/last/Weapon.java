package day16.last;

/**
 * @Author：lmh
 * @Create: 2024-7-16 20:51
 */
public class Weapon {
    private String name;
    private int ap;
    private int price;
    public Weapon() {
    }
    public Weapon(String name, int ap, int price) {
        this.name = name;
        this.ap = ap;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAp() {
        return ap;
    }
    public void setAp(int ap) {
        this.ap = ap;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}
