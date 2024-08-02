package day31.work;

public class Test12 {
    public static void main(String[] args) {
        D2 t1 = new D2();
        T2 t2 = new T2();
        t1.setName("我");
        t2.setName("bt");
        t2.setDaemon(true);
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
t1.start();
t2.start();
    }
}
