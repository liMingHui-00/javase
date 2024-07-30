package day16.last;

/**
 * @Author：lmh
 * @Create: 2024-7-16 20:52
 */
public class Dagger extends Weapon{
    public void attack(){
        System.out.println(getName()+"攻击");
    }
    public Dagger() {
    }
    public Dagger(String name, int ap, int price) {
        super(name, ap, price);
    }
}
