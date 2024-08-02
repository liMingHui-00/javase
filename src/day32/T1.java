package day32;

public class T1 extends Thread{
    @Override
    public void run() {
//        兔子
        for (int i = 0; i < 500;) {
            try {
//                每0.01秒跑一米
                Thread.sleep(10);
                i++;
                System.out.println("兔子跑了"+i+"米");
                if (i==400){
                    System.out.println("兔子开始睡觉了");
                    Thread.sleep(20*1000);
                    System.out.println("兔子睡醒了，继续跑步");
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
