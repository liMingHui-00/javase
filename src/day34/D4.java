package day34;

public class D4 extends Thread {
        Object a;
        Object b;

        @Override
        public void run() {
            synchronized (b){
                System.out.println(getName()+"获取b锁");
                synchronized (a){
                    System.out.println(getName()+"获取a锁");
                }
                System.out.println(getName()+"释放a锁");
            }
            System.out.println(getName()+"释放b锁");
        }

}
