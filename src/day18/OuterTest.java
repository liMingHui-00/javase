package day18;

/**
 * @Author：lmh
 * @Create: 2024-7-18 11:22
 */
public class OuterTest {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.aa();
        System.out.println(outer.name);
        Outer.st();
//
        Outer.Inner inner = outer.new Inner();
        inner.cc();
    }
}
