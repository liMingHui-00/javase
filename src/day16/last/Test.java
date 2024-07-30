package day16.last;

/**
 * @Author：lmh
 * @Create: 2024-7-16 20:56
 */
public class Test {
    public static void main(String[] args) {
        Gun gun = new Gun("意大利炮",100,999);
        gun.fire();
        gun.reload();
        Dagger dagger = new Dagger("尼泊尔",50,99);
        dagger.attack();
    }
}
