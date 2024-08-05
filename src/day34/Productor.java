package day34;

public class Productor implements Runnable {
//    生产者
    public Productor(Saler saler) {
        this.saler = saler;
    }

    private Saler saler;

    @Override
    public void run() {
        while (true){
            saler.sc();
        }
    }
}
