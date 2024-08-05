package day34.work2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bank implements Runnable {
    Lock lock = new ReentrantLock();
    int money = 500;
    boolean flag = true;

    @Override
    public void run() {
        while (flag){
            zq();
        }
    }
    public void zq(){
        lock.lock();
        if (money>5000){
            lock.unlock();
            flag = false;
            return;
        }
        money+=1000;
        System.out.println(Thread.currentThread().getName()+"转了1000，现在是"+money);
        lock.unlock();
    }
}
