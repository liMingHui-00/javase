package day32;

public class T2 extends Thread{
    @Override
    public void run() {
//        乌龟
        for (int i = 0; i < 500; ) {
            try {
                Thread.sleep(50);
                i++;
                System.out.println("乌龟跑了"+i+"米");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
