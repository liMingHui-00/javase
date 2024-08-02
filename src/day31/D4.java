package day31;

public class D4 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("线程二");
        }
    }
}
