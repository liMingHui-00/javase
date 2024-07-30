package day16;

/**
 * @Author：lmh
 * @Create: 2024-7-16 16:57
 */
public class Circle extends Shape{
    private int r;
    private int p;
    @Override
    public void mj(){
        System.out.println(p*r*r);
    }
    @Override
    public void zc(){
        System.out.println(r*2*p);
    }

    public Circle() {
    }

    public Circle(int r, int p) {
        this.r = r;
        this.p = p;
    }
}
