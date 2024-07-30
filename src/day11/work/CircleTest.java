package day11.work;

/**
 * @Author：lmh
 * @Create: 2024-7-11 19:50
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.r = 5;
        double zc = 0.0;
        double mj = 0.0;
        zc = c1.zc(c1);
        mj = c1.mj(c1);
        System.out.println(zc);
        System.out.println(mj);
    }
}
