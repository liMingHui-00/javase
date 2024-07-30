package day16.homeWork.work;

/**
 * @Author：lmh
 * @Create: 2024-7-17 11:36
 */
public class TestShape {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rect rect = new Rect(20,10);
        Shape shapeArr[] = {circle,rect};
        for (Shape shape : shapeArr){
            shape.zc();
            shape.mj();
        }
    }
}
