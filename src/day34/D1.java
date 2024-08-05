package day34;

public class D1 implements Runnable{
   int count = 100;
    boolean flag = true;
    @Override
    public void run() {
        while (flag){
            sale();
        }
    }

//    private void sale() {
//        synchronized (Thread.class){
//            if (count<=0){
//                flag = false;
//                return;
//            }
//            System.out.println(Thread.currentThread().getName()+"窗口卖出了第"+count+"票");
//            count--;
//        }
//    }
private synchronized void sale() {
        if (count<=0){
            flag = false;
            return;
        }
        System.out.println(Thread.currentThread().getName()+"窗口卖出了第"+count+"票");
        count--;
}
}
