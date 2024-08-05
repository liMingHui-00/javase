package day34;

public class Customer implements Runnable {
    Saler saler;

    public Customer(Saler saler) {
        this.saler = saler;
    }

    @Override
    public void run() {
        while (true)
        {
            saler.xf();
        }
    }
}
