package day16.homeWork.work;

/**
 * @Author：lmh
 * @Create: 2024-7-16 20:22
 */
public class Rect extends Shape{
    private int width;
    private int height;

    public Rect() {
    }

    public Rect(int width, int height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public void zc(){
        System.out.println("矩形的周长为："+2*(width+height));
    }
    @Override
    public void mj(){
        System.out.println("矩形的面积为："+width*height);
    }
}
