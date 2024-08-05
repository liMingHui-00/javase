package day34;

public class D2 {
    public static void main(String[] args) {
        D1 d1 = new D1();
        Thread thread = new Thread(d1,"窗口一");
        Thread thread1 = new Thread(d1,"12306");
        thread.start();
        thread1.start();
    }
}
