package day18;

/**
 * @Author：lmh
 * @Create: 2024-7-18 11:45
 */
public class StaticTest {
    public static void main(String[] args) {
        StaticA.B b = new StaticA.B();
        b.bb();
        StaticA.B.b();
        System.out.println(StaticA.B.name);
    }
}
