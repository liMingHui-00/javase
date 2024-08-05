package day33;

public class D1 extends Thread {
    static int ticket =0;
    @Override
    public void run() {
        while (true){
         synchronized (Thread.class){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if (ticket<100){
                    ticket++;
                    System.out.println("正在卖第"+ticket);
                }else {
                    break;
                }
            }
        }
    }
}
