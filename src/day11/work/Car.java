package day11.work;

/**
 * @Author：lmh
 * @Create: 2024-7-11 19:43
 */
public class Car {
    String brand;
    double power;
    public void warning(Car car){
        if (car.power<10){
            System.out.println("电量不足");
        }else {
            System.out.println("电量充足");
        }
    }
}
