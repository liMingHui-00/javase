package day16.homeWork.work;

/**
 * @Author：lmh
 * @Create: 2024-7-16 20:24
 */
public class Circle extends Shape{
    private int r;

    public Circle() {
    }

    public Circle(int r) {
        this.r = r;
    }
    @Override
    public void zc(){
        System.out.println("圆的周长为："+2*(getPI()+r));
    }
    @Override
    public void mj(){
        System.out.println("圆的面积为："+r*r*getPI());
    }
}
