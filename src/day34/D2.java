package day34;

public class D2 {
    public static void main(String[] args) {
        D1 d1 = new D1();
        Thread thread = new Thread(d1);
        Thread thread1 = new Thread(d1);
//        thread.start();
//        thread1.start();
        System.out.println(d1);
    }
}
