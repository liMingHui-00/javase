package day34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class D9 {
    public static void main(String[] args) {
        D8 d8 = new D8();
        FutureTask futureTask = new FutureTask(d8);
        Thread thread = new Thread(futureTask);
        thread.start();
        try {
            System.out.println(futureTask.get());
            for (int i = 0; i < 10; i++) {
                System.out.println("====="+i);
            }
            FileInputStream fileInputStream  = new FileInputStream("dad");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
