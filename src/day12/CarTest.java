package day12;

/**
 * @Author：lmh
 * @Create: 2024-7-12 14:56
 */
public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car carArr[] = {car1,car2};
        car1.brand="兰博基尼";
        car1.price= 1;
        car2.brand="法拉利";
        car2.price=2;
        for (Car c:carArr){
            System.out.println(c.brand);
        }
    }
}
