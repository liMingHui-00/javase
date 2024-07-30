package day14;

import java.util.Scanner;

/**
 * @Author：lmh
 * @Create: 2024-7-14 11:49
 */
public class CarTest {
    public static void main(String[] args) {
        Car carArr [] = new Car[3];
        for (int i = 0; i < carArr.length; i++) {
            Car car = new Car();
            System.out.println("请输入car的品牌");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.next();
            car.setName(name);
            System.out.println("请输入car的价格");
            int price = scanner.nextInt();
            car.setPrice(price);
            System.out.println("请输入car的颜色");
            String color = scanner.next();
            car.setColor(color);
//            放入到数组中
            carArr[i] = car;
        }
//        遍历
        for (Car car:carArr){
            System.out.println(car.getName()+"--"+car.getColor()+"--"+car.getPrice());
        }
    }
}
