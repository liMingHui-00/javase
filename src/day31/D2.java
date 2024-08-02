package day31;

public class D2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("线程二==============================");
        }
    }
}
