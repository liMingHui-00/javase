package day31;

public class D7 extends Thread {
    public D7() {
    }

    public D7(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            Thread.sleep(55);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < 100; i++) {
            String name = Thread.currentThread().getName();
            System.out.println(getName()+"---"+name);
        }
    }
}
