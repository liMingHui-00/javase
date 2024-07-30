package day11.work;

/**
 * @Author：lmh
 * @Create: 2024-7-11 19:45
 */
public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "特斯拉";
        car.power = 50;
        Car car1 = new Car();
        car1.power = 9;
        car1.brand = "比亚迪";
        car.warning(car);
        car1.warning(car1);
    }
}
