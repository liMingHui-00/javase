package day11.work;

/**
 * @Author：lmh
 * @Create: 2024-7-11 19:47
 */
public class Circle {
    final double PI = 3.14;
    int r ;
    public double zc(Circle circle){
        return (circle.r*PI*2);
    }
    public double mj(Circle circle){
        return (circle.r*PI*circle.r);
    }
}
