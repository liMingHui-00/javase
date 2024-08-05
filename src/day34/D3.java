package day34;

public class D3 extends Thread {
    Object a;
    Object b;

    @Override
    public void run() {
        synchronized (a){
            System.out.println(getName()+"获取A锁");
            synchronized (b){
                System.out.println(getName()+"获取B锁");
            }
            System.out.println(getName()+"释放B锁");
        }
        System.out.println(getName()+"释放A锁");
    }
}
