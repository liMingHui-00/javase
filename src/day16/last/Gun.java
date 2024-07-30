package day16.last;


/**
 * @Author：lmh
 * @Create: 2024-7-16 20:50
 */
public class Gun extends Weapon {
    public void fire(){
        System.out.println(getName()+"发射子弹");
    }
    public void reload(){
        System.out.println(getName()+"更换弹夹");
    }
    public Gun() {
    }
    public Gun(String name, int ap, int price) {
        super(name, ap, price);
    }
}
