package day16;

/**
 * @Author：lmh
 * @Create: 2024-7-16 16:53
 */
public class Rect extends Shape {
    private int chang;
    private int kuan;
    @Override
    public void mj(){
        System.out.println(chang*kuan);
    }
    @Override
    public void zc(){
        System.out.println(chang*2+kuan*2);
    }
}
