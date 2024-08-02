package day31;

public class D5 {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 500; i++) {
                    System.out.println("线程一");
                }
            }
        };
        Runnable r1 = ()->{
            for (int i = 0; i < 500; i++) {
                System.out.println("----------------------");
            }
        };
        Thread t2 = new Thread(r1);
        t1.start();
        t2.start();
    }
}
