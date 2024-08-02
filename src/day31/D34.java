package day31;

public class D34 {
    public static void main(String[] args) {
        D3 r1 = new D3();
        D4 r2 = new D4();
        Thread thread = new Thread(r1);
        Thread thread1 = new Thread(r2);
        thread.start();
        thread1.start();
    }
}
