package day23.test;
public class D11 {
    public static void main(String[] args) {
        System.err.println("我是错误");
        System.out.println(System.currentTimeMillis());
        System.gc();
        System.exit(0);
    }
}
