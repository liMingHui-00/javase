package day31.work;

public class T2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+"===="+i);
        }
    }
}
