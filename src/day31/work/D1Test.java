package day31.work;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class D1Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        D1 d1 = new D1();
        FutureTask<Integer> integerFutureTask = new FutureTask<>(d1);
        Thread thread = new Thread(integerFutureTask);
        thread.start();
        System.out.println(integerFutureTask.get());
        System.out.println(Thread.currentThread().getPriority());
    }
}
